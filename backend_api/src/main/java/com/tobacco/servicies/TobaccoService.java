package com.tobacco.servicies;

import com.tobacco.dto.TobaccoDto;
import com.tobacco.mappers.TobaccoMapper;
import com.tobacco.models.TobaccoEntity;
import com.tobacco.repository.TobaccoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TobaccoService {

    @Autowired
    private TobaccoMapper tobaccoMapper;

    @Autowired
    private TobaccoRepository tobaccoRepository;

    public TobaccoDto createTobacco(TobaccoDto tobaccoDto){
        TobaccoEntity tobacco = tobaccoMapper.toTobaccoEntity(tobaccoDto);
        return tobaccoMapper.fromTobaccoEntity(
                tobaccoRepository.save(tobacco));
    }

    public Page<TobaccoDto> findAll(Pageable pageable) {
        return tobaccoRepository.findAll(pageable)
                .map(tobacco -> tobaccoMapper.fromTobaccoEntity(tobacco));
    }

}
