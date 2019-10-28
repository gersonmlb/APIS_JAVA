package com.kazale.crud.api.services;

import java.util.List;

import com.kazale.crud.api.documents.Users;

public interface UsersService {
	
	List<Users> listarTodos();
	
	Users listarPorId(String id);
	
	Users cadastrar(Users users);
	
	Users atualizar(Users users);
	
	void remover(String id);

}
