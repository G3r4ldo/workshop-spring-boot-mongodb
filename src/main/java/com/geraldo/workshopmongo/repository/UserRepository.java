package com.geraldo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.geraldo.workshopmongo.domain.User;


// o primeiro dado é a classe que ele irá gerenciar, o segundo é qual é o tipo do ID
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
