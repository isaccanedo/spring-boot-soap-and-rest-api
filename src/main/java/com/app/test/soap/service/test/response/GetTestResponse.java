package com.app.test.soap.service.test.response;

import com.app.test.soap.model.TestModel;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "testModel"
})
@XmlRootElement(name = "GetTestResponse")
public class GetTestResponse {
    @XmlElement(name = "testModel", required = true)
    protected TestModel testModel;

    public TestModel getTestModel() {
        return testModel;
    }

    public void setTestModel(TestModel testModel) {
        this.testModel = testModel;
    }
}
