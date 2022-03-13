package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.devsuperior.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, String>{

	User findByEmail(String email);
}
