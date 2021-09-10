package com.example.demo.repository;

import com.example.demo.model.DryersLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DryersLogRepository extends JpaRepository<DryersLog,Integer> {

    DryersLog findFirstBy();

}
