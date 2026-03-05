package com.example.learn_spring_framework.enterprise.example;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Component
public class MyWebController {

    @Autowired
    private BusinessService businessService;

    public long returnValueFromBusinessService() {
        return businessService.calculateSum();
    }
}

@Component
class BusinessService {
    @Autowired
    private DataService dataService;

    public BusinessService(DataService dataService) {
        super();
        System.out.println("Constructor Injection");
        this.dataService = dataService;
    }

    //    @Autowired
//    public void setDataService(DataService dataService) {
//        System.out.println("Setter Injection");
//        this.dataService = dataService;
//    }

    public long calculateSum() {
        List<Integer> data = dataService.getData();
        return data.stream().mapToLong(Integer::longValue).sum();
    }
}

@Component
class DataService {

    public List<Integer> getData() {
        return Arrays.asList(10, 20, 30, 40);
    }
}

