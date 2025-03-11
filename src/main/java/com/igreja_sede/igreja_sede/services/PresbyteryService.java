package com.igreja_sede.igreja_sede.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreja_sede.igreja_sede.entities.Community;
import com.igreja_sede.igreja_sede.entities.Position;
import com.igreja_sede.igreja_sede.entities.Presbytery;
import com.igreja_sede.igreja_sede.repositories.PresbyteryRepository;

@Service
public class PresbyteryService {

	@Autowired
	private PresbyteryRepository repository;
	
	public List<Presbytery> findAll() {
		return repository.findAll();
	}
	
	public Presbytery findById(Long id) {
		Optional<Presbytery> obj = repository.findById(id);
		return obj.get();
	}
	
    public List<Presbytery> getPresbytersByCommunity(Community community) {
        return repository.findByCommunity(community);
    }

    public List<Presbytery> getPresbytersByPosition(Position position) {
        return repository.findByPosition(position);
    }
}
