package com.tobacco.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tobacco.common.Constants;
import com.tobacco.servicies.CurrentUserDetails;
import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


@RequestMapping(Constants.API_PATH + "/login")
public class LoginController {

    @GetMapping()
    public String publicEndpoint() throws JSONException, JsonProcessingException {
        return CurrentUserDetails.getUserId();
    }

}
