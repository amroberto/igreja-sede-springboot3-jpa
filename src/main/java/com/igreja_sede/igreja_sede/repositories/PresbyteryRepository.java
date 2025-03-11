package com.igreja_sede.igreja_sede.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igreja_sede.igreja_sede.entities.Community;
import com.igreja_sede.igreja_sede.entities.Position;
import com.igreja_sede.igreja_sede.entities.Presbytery;

public interface PresbyteryRepository extends JpaRepository<Presbytery, Long>{

	List<Presbytery> findByCommunity(Community community);
	
    List<Presbytery> findByPosition(Position position);
}
