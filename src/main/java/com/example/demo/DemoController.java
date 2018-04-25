package com.example.demo;

import com.test.api.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: chenhongwei
 * @date: Created in 下午1:11 2018/4/25
 * @version: 1.0
 */
@RestController
public class DemoController {

    @Autowired
    private HelloClient helloClient;


    @GetMapping("get")
    public String testClinet() {

        return helloClient.sayHello();
    }
}
