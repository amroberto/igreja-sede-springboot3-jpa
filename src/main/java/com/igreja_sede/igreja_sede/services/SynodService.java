package com.igreja_sede.igreja_sede.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreja_sede.igreja_sede.entities.Synod;
import com.igreja_sede.igreja_sede.repositories.SynodRepository;

@Service
public class SynodService {

	@Autowired
	private SynodRepository repository;
	
	public List<Synod> findAll() {
		return repository.findAll();
	}
	
	public Synod findById(Long id) {
		Optional<Synod> obj = repository.findById(id);
		return obj.get();
	}
}
