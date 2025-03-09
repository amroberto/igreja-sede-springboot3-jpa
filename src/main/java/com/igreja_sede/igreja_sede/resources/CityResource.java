package com.igreja_sede.igreja_sede.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja_sede.igreja_sede.entities.City;
import com.igreja_sede.igreja_sede.services.CityService;

@RestController
@RequestMapping(value = "/cities")
public class CityResource {

	@Autowired
	private CityService service;
	
	@GetMapping
	public ResponseEntity<List<City>> findAll(){
		List<City> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<City> findById(@PathVariable Integer id) {
		City obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
