package kg.sweezy.usermicroservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${message}")
    private String value;

    @Value("${global}")
    private String global;

    //Проверяем с какого инстанса по uuid
    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping("/hello")
    public String hello(){
        return "hello from user microservice:" + id;
    }

    @GetMapping("/get-value")
    public String getValue(){
        return "FROM CONFIG SERVER: " + value;
    }

    @GetMapping("/get-global")
    public String getGlobal(){
        return "FROM CONFIG SERVER: " + global;
    }
}
