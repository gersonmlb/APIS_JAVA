package com.kazale.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kazale.crud.api.documents.Users;

public interface UsersRepository extends MongoRepository<Users, String> {

}
