package com.igreja_sede.igreja_sede.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja_sede.igreja_sede.entities.Synod;
import com.igreja_sede.igreja_sede.services.SynodService;

@RestController
@RequestMapping(value = "/synods")
public class SynodResource {

	@Autowired
	private SynodService service;
	
	@GetMapping
	public ResponseEntity<List<Synod>> findAll(){
		List<Synod> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Synod> findById(@PathVariable Long id) {
		Synod obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
