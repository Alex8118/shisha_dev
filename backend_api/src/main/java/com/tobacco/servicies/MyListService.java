package com.tobacco.servicies;

import com.tobacco.dto.MyListDto;
import com.tobacco.mappers.MyListMapper;
import com.tobacco.models.MyListEntity;
import com.tobacco.repository.MyListRepository;
import com.tobacco.repository.TobaccoRepository;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@Service
public class MyListService {

    @Autowired
    private MyListRepository myListRepository;

    @Autowired
    private TobaccoRepository tobaccoRepository;

    @Autowired
    private MyListMapper myListMapper;

    public MyListDto createMyList(MultipartFile multipartImage) throws IOException, JSONException {
        MyListEntity myListEntity = new MyListEntity();
        myListEntity.setUploadFile(multipartImage.getBytes());
        //TODO метод метод определения табака
        myListEntity.setTobaccoEntity(tobaccoRepository.findById(1));//tobacco_id=1
        myListEntity.setUserId(CurrentUserDetails.getUserId());
        myListRepository.save(myListEntity);
        return myListMapper.fromMyListEntity(myListEntity);
    }

    public Page<MyListDto> findByUserId (Pageable pageable) throws IOException, JSONException {
        var userId = CurrentUserDetails.getUserId();
        return myListRepository.findByUserId(userId, pageable)
                .map(m -> myListMapper.fromMyListEntity(m));
    }

}
