package com.app.test.soap.service.test.endpoint;

import com.app.test.soap.model.TestModel;
import com.app.test.soap.service.test.request.GetTestRequest;
import com.app.test.soap.service.test.response.GetTestResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TestModelEndpoint {

    // http://localhost:80/ws/test.wsdl
    @PayloadRoot(namespace = "http://localhost:80/soap/test", localPart = "GetTestRequest")
    @ResponsePayload
    public GetTestResponse processTestRequest(@RequestPayload GetTestRequest request) {
        GetTestResponse response = new GetTestResponse();
        TestModel testModel = new TestModel();
        testModel.setId(request.getId());
        testModel.setContent("Has been received.");

        response.setTestModel(testModel);

        return response;
    }
}
