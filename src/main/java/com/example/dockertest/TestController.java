package com.example.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 59780
 */
@RestController
public class TestController {
    @GetMapping("helloword")
    public String helloword(){
       return "this is a docker demo";
    }
}
