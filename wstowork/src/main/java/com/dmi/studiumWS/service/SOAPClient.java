package com.dmi.studiumWS.service;

import it.unict.soap.studium.TBCheckSubscription;
import it.unict.soap.studium.TBCheckSubscriptionResponse;
import it.unict.soap.studium.TBGetCourses;
import it.unict.soap.studium.TBGetCoursesResponse;
import it.unict.soap.studium.TBGetDepartmentContent;
import it.unict.soap.studium.TBGetDepartmentContentResponse;
import it.unict.soap.studium.TBGetDepartments;
import it.unict.soap.studium.TBGetDepartmentsResponse;
import it.unict.soap.studium.TBGetYears;
import it.unict.soap.studium.TBGetYearsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class SOAPClient {
    
    @Autowired
    private Jaxb2Marshaller marshaller; 

    private final String BASE_URL = "http://ws1.unict.it/stdata/"; 
    
    private WebServiceTemplate getTemplate() {
        final WebServiceTemplate template = new WebServiceTemplate(marshaller);
        template.setDefaultUri("https://ws1.unict.it/wscea/wsstudium/StudentService.asmx");
        return template;
    }
    
    public TBGetYearsResponse getYears(String token) {
       final SoapActionCallback soapActionCallback = new SoapActionCallback(BASE_URL + "TB_GetYears");
       TBGetYears request = new TBGetYears();
       request.setToken(token);
       TBGetYearsResponse response = (TBGetYearsResponse) getTemplate().marshalSendAndReceive(request,soapActionCallback);
       return response;
    }
    
    public TBGetDepartmentsResponse getDepartments(String token, String aa) {
        final SoapActionCallback soapActionCallback = new SoapActionCallback(BASE_URL + "TB_GetDepartments");
        TBGetDepartments request = new TBGetDepartments();
        request.setToken(token);
        request.setAa(aa); // Anno Accademico
        TBGetDepartmentsResponse response = (TBGetDepartmentsResponse) getTemplate().marshalSendAndReceive(request, soapActionCallback);
        return response; 
    }
    
    public TBGetDepartmentContentResponse getCdL(String token, String aa, String idDepartment) {
        final SoapActionCallback soapActionCallback = new SoapActionCallback(BASE_URL + "TB_GetDepartmentContent");
        TBGetDepartmentContent request = new TBGetDepartmentContent();
        request.setToken(token);
        request.setAa(aa);
        request.setId(idDepartment);
        TBGetDepartmentContentResponse response = (TBGetDepartmentContentResponse) getTemplate().marshalSendAndReceive(request, soapActionCallback);
        return response;
    }
    
    public TBGetCoursesResponse getCourses(String token, String aa, String idCdL) {
        final SoapActionCallback soapActionCallback = new SoapActionCallback(BASE_URL + "TB_GetCourses");
        TBGetCourses request = new TBGetCourses();
        request.setToken(token);
        request.setAa(aa);
        request.setId(idCdL);
        TBGetCoursesResponse response = (TBGetCoursesResponse) getTemplate().marshalSendAndReceive(request, soapActionCallback);
        return response;
    }
    
    private TBCheckSubscriptionResponse _checkSubscription(String token, String aa, String idCourse, String userCF) {
        final SoapActionCallback soapActionCallback = new SoapActionCallback(BASE_URL + "TB_CheckSubscription");
        TBCheckSubscription request = new TBCheckSubscription(); 
        request.setToken(token);
        request.setAa(aa);
        request.setCourse(idCourse);
        request.setUser(userCF);
        TBCheckSubscriptionResponse response = (TBCheckSubscriptionResponse) getTemplate().marshalSendAndReceive(request, soapActionCallback);
        return response;
    }
    
    public boolean checkSubscription(String token, String aa, String idCourse, String userCF) {
        return (_checkSubscription(token,aa,idCourse,userCF).getTBCheckSubscriptionResult().equals("si"));
    }
    
    
    
}
