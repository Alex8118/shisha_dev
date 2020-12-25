package com.tobacco.servicies;

import com.tobacco.dto.TobaccoDto;
import com.tobacco.mappers.TobaccoMapper;
import com.tobacco.models.MyListEntity;
import com.tobacco.models.TobaccoEntity;
import com.tobacco.repository.TobaccoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TobaccoService {

    @Autowired
    private TobaccoMapper tobaccoMapper;

    @Autowired
    private TobaccoRepository tobaccoRepository;

    public TobaccoDto createTobacco(TobaccoDto tobaccoDto) throws IOException {
        var tobacco = tobaccoMapper
                .toTobaccoEntity(tobaccoDto);
        return tobaccoMapper.fromTobaccoEntity(
                tobaccoRepository.save(tobacco));
    }

}
