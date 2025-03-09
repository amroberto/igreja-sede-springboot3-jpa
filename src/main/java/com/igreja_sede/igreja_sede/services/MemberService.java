package com.igreja_sede.igreja_sede.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igreja_sede.igreja_sede.entities.Member;
import com.igreja_sede.igreja_sede.repositories.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository repository;
	
	public List<Member> findAll() {
		return repository.findAll();
	}
	
	public Member findById(Long id) {
		Optional<Member> obj = repository.findById(id);
		return obj.get();
	}
}
