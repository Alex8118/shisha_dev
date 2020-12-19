package com.tobacco.controllers;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.tobacco.common.Constants;
import com.tobacco.servicies.CurrentUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(Constants.API_PATH + "/login")
public class LoginController {

    //@Autowired
    //private CurrentUserDetails currentUserDetails;

    @GetMapping()
    public HttpResponse<String> publicEndpoint() throws UnirestException {
        var userSecurity = CurrentUserDetails.getUserSecurity();
        return userSecurity;
    }
}
