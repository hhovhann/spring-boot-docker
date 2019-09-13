package com.hhovhann.springbootdocker.repository;

import com.hhovhann.springbootdocker.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<User, String> {
    User findByName(String name);

    void deleteByName(String name);
}