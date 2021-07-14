package com.example.demo.service;

import com.example.demo.web.request.EmailRequest;
import com.example.demo.web.response.EmailResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmailService {
    EmailResponse getEmail(@RequestBody EmailRequest request);
}
