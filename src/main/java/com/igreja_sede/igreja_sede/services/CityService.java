package com.igreja_sede.igreja_sede.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreja_sede.igreja_sede.entities.City;
import com.igreja_sede.igreja_sede.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository repository;
	
	public List<City> findAll() {
		return repository.findAll();
	}
	
	public City findById(Integer id) {
		Optional<City> obj = repository.findById(id);
		return obj.get();
	}
}
