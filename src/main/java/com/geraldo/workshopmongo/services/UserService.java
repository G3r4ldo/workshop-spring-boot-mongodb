package com.geraldo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geraldo.workshopmongo.domain.User;
import com.geraldo.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	//coloca essa anotação quando for instanciar um objeto
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}

}
