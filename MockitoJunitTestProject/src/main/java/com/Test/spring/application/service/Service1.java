package com.Test.spring.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Test.spring.application.model.Cloths;
import com.Test.spring.application.repository.Repository1;

@Service
public class Service1 {

	@Autowired
	private Repository1 repository;
	
	public List<Cloths> getCloths() {
		return repository.findAll();
	}

	public Optional<Cloths> getClothsForId(int clothsId) {
		return repository.findById(clothsId);
	}

	public Cloths setCloth(Cloths cloth) {
		return repository.save(cloth);
	}
	
}
