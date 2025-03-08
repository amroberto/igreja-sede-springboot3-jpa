package com.igreja_sede.igreja_sede.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igreja_sede.igreja_sede.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
