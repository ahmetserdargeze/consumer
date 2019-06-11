package com.ahmedserdargeze.kafkaconsumer.repository;

import com.ahmedserdargeze.kafkaconsumer.entity.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogEntityRepository extends JpaRepository<LogEntity,String> {
    List<LogEntity> findAll();
}
