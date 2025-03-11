package com.igreja_sede.igreja_sede.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja_sede.igreja_sede.entities.Position;
import com.igreja_sede.igreja_sede.services.PositionService;

@RestController
@RequestMapping(value = "/positions")
public class PositionResource {

	@Autowired
	private PositionService service;
	
	@GetMapping
	public ResponseEntity<List<Position>> findAll(){
		List<Position> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Position> findById(@PathVariable long id) {
		Position obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
