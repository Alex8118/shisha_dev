package com.tobacco.controllers;

import com.tobacco.common.Constants;
import com.tobacco.dto.MyListDto;
import com.tobacco.servicies.MyListService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@RestController
@RequestMapping(Constants.API_PATH + "/request")
public class MyListController {

    @Autowired
    private MyListService myListService;

    @PostMapping("/my-list")
    MyListDto uploadImage(@RequestParam MultipartFile multipartImage) throws Exception {
        return myListService.createMyList(multipartImage);
    }

    @Transactional(readOnly = true)
    @GetMapping ("/my-list")
    public Page<MyListDto> find(@PageableDefault(size = 10, page = 0) Pageable pageable
                                    ) throws IOException, JSONException {
        return myListService.findByUserId(pageable);
    }

}
