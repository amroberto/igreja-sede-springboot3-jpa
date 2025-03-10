package com.igreja_sede.igreja_sede.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreja_sede.igreja_sede.entities.State;
import com.igreja_sede.igreja_sede.repositories.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository repository;
	
	public List<State> findAll() {
		return repository.findAll();
	}
	
	public State findById(Long id) {
		Optional<State> obj = repository.findById(id);
		return obj.get();
	}
}
