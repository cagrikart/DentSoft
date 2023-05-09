package com.backend.dentsoft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get")
public class Controller {
    @GetMapping("/get")
    public String Dasadsdas (){
        return "oldu mu?";
    }
}
