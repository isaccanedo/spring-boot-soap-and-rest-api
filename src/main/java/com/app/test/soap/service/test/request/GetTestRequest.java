package com.app.test.soap.service.test.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "id"
})
@XmlRootElement(name = "GetTestRequest")
public class GetTestRequest {
    protected int id;

    public int getId() {
        return id;
    }
    public void setId(int value) {
        this.id = value;
    }
}
