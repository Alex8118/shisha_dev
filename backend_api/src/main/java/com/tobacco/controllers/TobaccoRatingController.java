package com.tobacco.controllers;

import com.tobacco.common.Constants;
import com.tobacco.dto.TobaccoDto;
import com.tobacco.dto.TobaccoRatingDto;
import com.tobacco.mappers.TobaccoMapper;
import com.tobacco.servicies.TobaccoRatingService;
import com.tobacco.servicies.TobaccoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.API_PATH + "/request")
public class TobaccoRatingController {

    @Autowired
    private TobaccoRatingService tobaccoRatingService;

    @PutMapping("/tobacco-rating")
    public TobaccoRatingDto update (@RequestBody TobaccoRatingDto tobaccoRatingDto){
        return tobaccoRatingService.update(tobaccoRatingDto);
    }


}
