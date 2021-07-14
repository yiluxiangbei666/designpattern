package com.example.demo.service.impl;

import com.example.demo.service.EmailService;
import com.example.demo.web.request.EmailRequest;
import com.example.demo.web.response.EmailResponse;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Override
    public EmailResponse getEmail(EmailRequest request) {
        return new EmailResponse(request.getIsName(),request+"@tw666.com");
    }
}
