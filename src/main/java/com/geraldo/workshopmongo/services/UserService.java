package com.geraldo.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geraldo.workshopmongo.domain.User;
import com.geraldo.workshopmongo.dto.UserDTO;
import com.geraldo.workshopmongo.repository.UserRepository;
import com.geraldo.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	//coloca essa anotação quando for instanciar um objeto
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(),objDto.getName(),objDto.getEmail());
	}

}
