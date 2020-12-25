package com.tobacco.controllers;

import com.tobacco.common.Constants;
import com.tobacco.dto.MyListDto;
import com.tobacco.dto.TobaccoDto;
import com.tobacco.servicies.MyListService;
import com.tobacco.servicies.TobaccoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(Constants.API_PATH + "/request")
public class TobaccoController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TobaccoService tobaccoService;

    @PostMapping("/tobacco")
    TobaccoDto create(@RequestBody TobaccoDto tobaccoDto) throws Exception {
        return tobaccoService.createTobacco(tobaccoDto);
    }
}
