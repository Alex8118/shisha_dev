package com.tobacco.repository;

import com.tobacco.models.MyListEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyListRepository extends JpaRepository<MyListEntity, Integer> {

    MyListEntity save(MyListEntity myListEntity);

    Page<MyListEntity> findByUserId(String userId, Pageable pageable);
}
