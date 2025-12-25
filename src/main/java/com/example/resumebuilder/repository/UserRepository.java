package com.example.resumebuilder.repository;

import com.example.resumebuilder.document.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, ObjectId> {


    boolean existsByEmail(String email);

    Optional<User> findByVerificationToken(String token);

}
