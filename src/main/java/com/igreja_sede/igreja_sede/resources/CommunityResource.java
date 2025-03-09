package com.igreja_sede.igreja_sede.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja_sede.igreja_sede.entities.Community;
import com.igreja_sede.igreja_sede.services.CommunityService;


@RestController
@RequestMapping(value = "/communities")
public class CommunityResource {

	@Autowired
	private CommunityService service;
	
	@GetMapping
	public ResponseEntity<List<Community>> findAll(){
		List<Community> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Community> findById(@PathVariable Long id) {
		Community obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
