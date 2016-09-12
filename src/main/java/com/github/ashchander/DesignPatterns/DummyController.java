package com.github.ashchander.DesignPatterns;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ashwin on 9/11/16.
 */
@Controller
@EnableAutoConfiguration
public class DummyController {

    @GetMapping("/api")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
