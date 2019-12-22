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
 *         &lt;element name="TB_CheckSubscriptionResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "tbCheckSubscriptionResult"
})
@XmlRootElement(name = "TB_CheckSubscriptionResponse")
public class TBCheckSubscriptionResponse {

    @XmlElement(name = "TB_CheckSubscriptionResult")
    protected String tbCheckSubscriptionResult;

    /**
     * Recupera il valore della proprietà tbCheckSubscriptionResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTBCheckSubscriptionResult() {
        return tbCheckSubscriptionResult;
    }

    /**
     * Imposta il valore della proprietà tbCheckSubscriptionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTBCheckSubscriptionResult(String value) {
        this.tbCheckSubscriptionResult = value;
    }

}
