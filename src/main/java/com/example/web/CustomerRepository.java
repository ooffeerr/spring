package com.example.web;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<User, String> {

    public User findByUserName(String username);
//    public List<User> findByLastName(String lastName);


}