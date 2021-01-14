package com.tobacco.controllers;

import com.tobacco.common.Constants;
import com.tobacco.dto.TobaccoDto;
import com.tobacco.servicies.TobaccoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.API_PATH + "/request")
public class TobaccoController {

    @Autowired
    private TobaccoService tobaccoService;

    @PostMapping("/tobacco")
    TobaccoDto create(@RequestBody TobaccoDto tobaccoDto) throws Exception {
        return tobaccoService.createTobacco(tobaccoDto);
    }

    @Transactional(readOnly = true)
    @GetMapping ("/tobacco-list")
    public Page<TobaccoDto> findAll(@PageableDefault(size = 10, page = 0) Pageable pageable){
        return tobaccoService.findAll(pageable);
    }

}
