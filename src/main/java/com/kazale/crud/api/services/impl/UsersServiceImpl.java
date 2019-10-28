package com.kazale.crud.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazale.crud.api.documents.Users;
import com.kazale.crud.api.repositories.UsersRepository;
import com.kazale.crud.api.services.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersRepository usersRespository;

	@Override
	public List<Users> listarTodos() {
		return this.usersRespository.findAll();
	}

	@Override
	public Users listarPorId(String id) {
		return this.usersRespository.findOne(id);
	}

	@Override
	public Users cadastrar(Users users) {
		users.setEstado("1");
		return this.usersRespository.save(users);
	}

	@Override
	public Users atualizar(Users users) {
		users.setEstado("1");
		return this.usersRespository.save(users);
	}

	@Override
	public void remover(String id) {
		this.usersRespository.delete(id);
	}

}
