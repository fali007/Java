package com.felix.demo.database;

import com.felix.demo.message.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface personRepository extends MongoRepository<Message,Integer> {
    Optional<Message> findByName(String name);
}
