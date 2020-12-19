package com.tobacco.repository;

import com.tobacco.models.MyListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyListRepository extends JpaRepository<MyListEntity, Long> {

    MyListEntity save(MyListEntity myListEntity);

}
