
package com.gdg.rocky.classes.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.16
 * Mon Dec 25 09:00:17 IST 2017
 * Generated source version: 3.0.16
 */

@XmlRootElement(name = "sumResponse", namespace = "http://classes.rocky.gdg.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sumResponse", namespace = "http://classes.rocky.gdg.com/")

public class SumResponse {

    @XmlElement(name = "return")
    private int _return;

    public int getReturn() {
        return this._return;
    }

    public void setReturn(int new_return)  {
        this._return = new_return;
    }

}

