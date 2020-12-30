package com.tobacco.repository;

import com.tobacco.models.TobaccoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TobaccoRepository extends JpaRepository<TobaccoEntity, Long> {

    TobaccoEntity save(TobaccoEntity tobaccoEntity);

    TobaccoEntity findById(Integer id);

}