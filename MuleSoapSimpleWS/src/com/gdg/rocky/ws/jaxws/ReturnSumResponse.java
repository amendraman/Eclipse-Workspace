
package com.gdg.rocky.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.16
 * Tue Jan 02 14:36:07 IST 2018
 * Generated source version: 3.0.16
 */

@XmlRootElement(name = "returnSumResponse", namespace = "http://ws.rocky.gdg.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "returnSumResponse", namespace = "http://ws.rocky.gdg.com/")

public class ReturnSumResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

