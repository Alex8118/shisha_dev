package com.tobacco.controllers;

import com.tobacco.common.Constants;
import com.tobacco.dto.MyListDto;
import com.tobacco.mappers.MyListMapper;
import com.tobacco.models.MyList;
import com.tobacco.servicies.MyListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(Constants.API_PATH + "/request")
public class MyListController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MyListMapper myListMapper;

    @Autowired
    private MyListService myListService;

    @PostMapping("/my-list")
    MyList uploadImage(@RequestParam MultipartFile multipartImage) throws Exception {
        MyListDto myListDto = new MyListDto();
        myListDto.setUploadFile(multipartImage.getBytes());
        var myList = myListMapper
                .toMyList(myListDto);
        return myListService.createMyList(myList);
    }
}




