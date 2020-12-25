package com.tobacco.servicies;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tobacco.dto.MyListDto;
import com.tobacco.mappers.MyListMapper;
import com.tobacco.models.MyListEntity;
import com.tobacco.models.TobaccoEntity;
import com.tobacco.repository.MyListRepository;
import com.tobacco.repository.TobaccoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.Optional;

@Service
public class MyListService {

    @Autowired
    private MyListRepository myListRepository;

    @Autowired
    private TobaccoRepository tobaccoRepository;

    @Autowired
    private MyListMapper myListMapper;

    public MyListDto createMyList(MultipartFile multipartImage) throws IOException {
        MyListEntity myListEntity = new MyListEntity();
        myListEntity.setUploadFile(multipartImage.getBytes());
        //TODO метод метод определения табака
        TobaccoEntity tobacco = tobaccoRepository.findById(1); //tobacco_id=1
        myListEntity.setTobaccoEntity(tobacco); //tobacco_id=1
        myListRepository.save(myListEntity);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper = objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return  objectMapper.convertValue(myListEntity, MyListDto.class);

    }

    public Page<MyListDto> findByUserId (int userId, Pageable pageable){
        return myListRepository.findByUserId(userId, pageable)
                .map(m -> myListMapper.fromMyListEntity(m));


    }

}
