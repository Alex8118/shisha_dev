package com.tobacco.controllers;

import com.tobacco.models.Message;
import com.tobacco.common.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Constants.API_PATH + "/login")
public class LoginController {

    @GetMapping()
    public Message publicEndpoint() {
        return new Message("All good. You are awesome.");
    }
}
