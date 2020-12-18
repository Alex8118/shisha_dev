package com.tobacco.servicies;

import com.tobacco.dto.MyListDto;
import com.tobacco.models.MyList;
import com.tobacco.repository.MyListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class MyListService {

    @Autowired
    private MyListRepository myListRepository;

    public MyList createMyList(MyList myList) {
        return myListRepository.save(myList);
    }

}
