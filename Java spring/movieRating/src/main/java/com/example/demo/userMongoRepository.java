package com.example.demo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface userMongoRepository extends MongoRepository<movieObj,String> {
	public Optional<movieObj> findByName(String name);
}
