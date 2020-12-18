package com.tobacco.repository;

import com.tobacco.models.MyList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyListRepository extends JpaRepository<MyList, Long> {

    MyList save(MyList myList);

}
