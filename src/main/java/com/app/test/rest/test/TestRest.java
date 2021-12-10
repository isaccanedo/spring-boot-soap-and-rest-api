package com.app.test.rest.test;

import com.app.test.model.TestModel;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/test")
@RestController
@Component
public class TestRest {

    @GetMapping("/get")
    public TestModel test() {
        TestModel testModel = new TestModel();
        testModel.setId(1);
        testModel.setContent("Test");
        return testModel;
    }
}
