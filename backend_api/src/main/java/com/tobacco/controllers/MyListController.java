package com.tobacco.controllers;

import com.tobacco.common.Constants;
import com.tobacco.dto.MyListDto;
import com.tobacco.servicies.MyListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(Constants.API_PATH + "/request")
public class MyListController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MyListService myListService;

    @PostMapping("/my-list")
    MyListDto uploadImage(@RequestParam MultipartFile multipartImage,
                          @RequestHeader("authorization") String jwtToken) throws Exception {
        return myListService.createMyList(multipartImage);
    }
}
