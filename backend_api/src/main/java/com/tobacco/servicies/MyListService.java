package com.tobacco.servicies;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tobacco.dto.MyListDto;
import com.tobacco.models.MyListEntity;
import com.tobacco.repository.MyListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@Service
public class MyListService {

    @Autowired
    private MyListRepository myListRepository;

    public MyListDto createMyList(MultipartFile multipartImage) throws IOException {
        MyListEntity myListEntity = new MyListEntity();
        myListEntity.setUploadFile(multipartImage.getBytes());
        myListRepository.save(myListEntity);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper = objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return  objectMapper.convertValue(myListEntity, MyListDto.class);

    }

}
