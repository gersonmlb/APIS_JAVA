package com.kazale.crud.api.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kazale.crud.api.documents.Users;
import com.kazale.crud.api.responses.Response;
import com.kazale.crud.api.services.UsersService;

@RestController
@RequestMapping(path = "/api/users")
public class UsersController {
	
	@Autowired
	private UsersService clienteService;
	
	@GetMapping
	public List<Users> listarTodos() {
		return clienteService.listarTodos();
	}
	
	@GetMapping(path = "/id")
	public ResponseEntity<Response<Users>> listarPorId(@RequestParam(name = "id") String id) {
		return ResponseEntity.ok(new Response<Users>(this.clienteService.listarPorId(id)));
	}
	
	@PostMapping(path = "/post")
	public ResponseEntity<Response<Users>> cadastrar( 
			//@RequestParam(name = "id") String id, 
			@RequestParam(name = "nombres") String nombres,
			@RequestParam(name = "apellidos") String apellidos,
			@RequestParam(name = "usuario") String usuario,
			@RequestParam(name = "clave") String clave
			) 
	{
		
		Users user = new Users();
		//user.setId(id);
		user.setNombres(nombres);
		user.setApellidos(apellidos);
		user.setUsuario(usuario);
		user.setClave(clave);
		user.setEstado("1");
		
		System.out.println(user);
		
		return ResponseEntity.ok(new Response<Users>(this.clienteService.cadastrar(user)));
	}
	
	@PutMapping(path = "/put")
	public ResponseEntity<Response<Users>> atualizar(
			@RequestParam(name = "id") String id, 
			@RequestParam(name = "nombres") String nombres,
			@RequestParam(name = "apellidos") String apellidos,
			@RequestParam(name = "usuario") String usuario,
			@RequestParam(name = "clave") String clave
		){
		Users user = new Users();
		user.setId(id);
		user.setNombres(nombres);
		user.setApellidos(apellidos);
		user.setUsuario(usuario);
		user.setClave(clave);
		user.setEstado("1");
		
		return ResponseEntity.ok(new Response<Users>(this.clienteService.atualizar(user)));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Response<Integer>> remover(@PathVariable(name = "id") String id) {
		this.clienteService.remover(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}

}
