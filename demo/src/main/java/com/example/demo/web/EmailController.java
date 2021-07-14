package com.example.demo.web;

import com.example.demo.web.request.EmailRequest;
import com.example.demo.web.response.EmailResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/email")
public class EmailController {
    @GetMapping(value = "getEmail")
    public EmailResponse getEmail(@RequestBody EmailRequest request){
        System.out.println(request);
        String result=request.getIsName()+"@qq.com";
        return new EmailResponse(request.getIsName(),result);
    }
}
