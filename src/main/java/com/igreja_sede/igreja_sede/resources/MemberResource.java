package com.igreja_sede.igreja_sede.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igreja_sede.igreja_sede.entities.Member;
import com.igreja_sede.igreja_sede.services.MemberService;

@RestController
@RequestMapping(value = "/members")
public class MemberResource {

	@Autowired
	private MemberService service;
	
	@GetMapping
	public ResponseEntity<List<Member>> findAll(){
		List<Member> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Member> findById(@PathVariable long id) {
		Member obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
