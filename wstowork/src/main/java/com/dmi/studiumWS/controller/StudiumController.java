package com.dmi.studiumWS.controller;

import com.dmi.studiumWS.service.SOAPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/studium")
public class StudiumController {
    
    @Value("${ws.token}")
    private String token;
    
    @Autowired
    private SOAPClient soap;
    
    @RequestMapping("/getYears") 
    public String getYears() {
        return soap.getYears(token).getTBGetYearsResult();
    }
    
    @RequestMapping("/getDepartments/{aa}") 
    public String getDepartments(@PathVariable String aa) {
        return soap.getDepartments(token, aa).getTBGetDepartmentsResult();
    }
    
    @RequestMapping("/getCdL/{aa}/{id}") 
    public String getCdL(@PathVariable String aa, @PathVariable String id) {
        return soap.getCdL(token, aa, id).getTBGetDepartmentContentResult();
    }
    
    @RequestMapping("/getCourses/{aa}/{id}") 
    public String getCourses(@PathVariable String aa, @PathVariable String id) {
        return soap.getCourses(token,aa,id).getTBGetCoursesResult();
    }
    
    @RequestMapping("/checkSubscription/{aa}/{course}/{user}") 
    public boolean checkSubscription(@PathVariable String aa, @PathVariable String course, @PathVariable String user) {
        return soap.checkSubscription(token, aa, course, user);
    }

}
