package com.Test.spring.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Test.spring.application.model.Cloths;

@Repository
public interface Repository1 extends JpaRepository<Cloths, Integer>{

}
