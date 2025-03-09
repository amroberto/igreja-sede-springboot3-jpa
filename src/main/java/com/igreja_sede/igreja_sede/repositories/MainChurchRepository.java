package com.igreja_sede.igreja_sede.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igreja_sede.igreja_sede.entities.MainChurch;

public interface MainChurchRepository extends JpaRepository<MainChurch, Long>{

	Optional<MainChurch> findFirstByOrderByIdAsc();
}