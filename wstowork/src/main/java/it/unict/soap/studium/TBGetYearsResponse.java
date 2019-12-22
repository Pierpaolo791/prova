//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.12.22 alle 01:55:22 PM CET 
//


package it.unict.soap.studium;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TB_GetYearsResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tbGetYearsResult"
})
@XmlRootElement(name = "TB_GetYearsResponse")
public class TBGetYearsResponse {

    @XmlElement(name = "TB_GetYearsResult")
    protected String tbGetYearsResult;

    /**
     * Recupera il valore della proprietà tbGetYearsResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTBGetYearsResult() {
        return tbGetYearsResult;
    }

    /**
     * Imposta il valore della proprietà tbGetYearsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTBGetYearsResult(String value) {
        this.tbGetYearsResult = value;
    }

}
