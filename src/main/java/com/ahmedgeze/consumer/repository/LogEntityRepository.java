package com.ahmedgeze.consumer.repository;

import com.ahmedgeze.consumer.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogEntityRepository extends JpaRepository<LogEntity,String> {
    List<LogEntity> findAll();
}
