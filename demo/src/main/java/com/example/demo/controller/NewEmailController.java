package com.example.demo.controller;

import com.example.demo.service.EmailService;
import com.example.demo.web.request.EmailRequest;
import com.example.demo.web.response.EmailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/controller/email")
public class NewEmailController {
    @Autowired
    EmailService emailService;
    @RequestMapping(value = "getEmail")
    public EmailResponse getEmail(@RequestBody EmailRequest emailRequest){
        return emailService.getEmail(emailRequest);
    }
}
