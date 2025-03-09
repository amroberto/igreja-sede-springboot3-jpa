package com.igreja_sede.igreja_sede.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreja_sede.igreja_sede.entities.Community;
import com.igreja_sede.igreja_sede.entities.User;
import com.igreja_sede.igreja_sede.repositories.CommunityRepository;

@Service
public class CommunityService {

	@Autowired
	private CommunityRepository repository;
	
	public List<Community> findAll() {
		return repository.findAll();
	}
	
	public Community findById(Long id) {
		Optional<Community> obj = repository.findById(id);
		return obj.get();
	}
}
