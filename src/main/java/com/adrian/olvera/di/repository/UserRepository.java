package com.adrian.olvera.di.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adrian.olvera.di.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
