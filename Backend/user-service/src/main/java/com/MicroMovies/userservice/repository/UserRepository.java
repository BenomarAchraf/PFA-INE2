package com.MicroMovies.userservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MicroMovies.userservice.model.User;

public interface UserRepository extends MongoRepository<User, String>{

	Optional<User> findByUsername(String username);

}
