//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.12.22 alle 01:55:22 PM CET 
//


package it.unict.soap.studium;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.unict.soap.studium package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.unict.soap.studium
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TBGetYears }
     * 
     */
    public TBGetYears createTBGetYears() {
        return new TBGetYears();
    }

    /**
     * Create an instance of {@link TBGetYearsResponse }
     * 
     */
    public TBGetYearsResponse createTBGetYearsResponse() {
        return new TBGetYearsResponse();
    }

    /**
     * Create an instance of {@link TBGetDepartments }
     * 
     */
    public TBGetDepartments createTBGetDepartments() {
        return new TBGetDepartments();
    }

    /**
     * Create an instance of {@link TBGetDepartmentsResponse }
     * 
     */
    public TBGetDepartmentsResponse createTBGetDepartmentsResponse() {
        return new TBGetDepartmentsResponse();
    }

    /**
     * Create an instance of {@link TBGetDepartmentContent }
     * 
     */
    public TBGetDepartmentContent createTBGetDepartmentContent() {
        return new TBGetDepartmentContent();
    }

    /**
     * Create an instance of {@link TBGetDepartmentContentResponse }
     * 
     */
    public TBGetDepartmentContentResponse createTBGetDepartmentContentResponse() {
        return new TBGetDepartmentContentResponse();
    }

    /**
     * Create an instance of {@link TBGetCourses }
     * 
     */
    public TBGetCourses createTBGetCourses() {
        return new TBGetCourses();
    }

    /**
     * Create an instance of {@link TBGetCoursesResponse }
     * 
     */
    public TBGetCoursesResponse createTBGetCoursesResponse() {
        return new TBGetCoursesResponse();
    }

    /**
     * Create an instance of {@link TBCheckSubscription }
     * 
     */
    public TBCheckSubscription createTBCheckSubscription() {
        return new TBCheckSubscription();
    }

    /**
     * Create an instance of {@link TBCheckSubscriptionResponse }
     * 
     */
    public TBCheckSubscriptionResponse createTBCheckSubscriptionResponse() {
        return new TBCheckSubscriptionResponse();
    }

}
