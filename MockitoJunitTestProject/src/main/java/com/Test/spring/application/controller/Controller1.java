package com.Test.spring.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Test.spring.application.model.Cloths;
import com.Test.spring.application.service.Service1;

@RestController("/api")
public class Controller1 {
	
	@Autowired
	private Service1 service;
	
	@GetMapping("/Cloths")
	public List<Cloths> getCloths() {
		return service.getCloths();	
	}
	
	@GetMapping("/Cloths/{clothsId}")
	public Optional<Cloths> getCloth(@PathVariable("clothsId") int clothsId ) {
		return service.getClothsForId(clothsId);
	}
	
	@PostMapping("/Cloths")
	public Cloths setCloths(@RequestBody Cloths cloth) {
		return service.setCloth(cloth);

	}
	
	@PutMapping("/Cloths")
	public Cloths updateCloths(@RequestBody Cloths cloth) {
		return service.setCloth(cloth);

	}
}
