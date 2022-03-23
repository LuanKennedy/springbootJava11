package com.luanspring.bootspring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luanspring.bootspring.entities.User;

@RestController 
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(10L, "Luan", "luan@gmail.com", "1119987989", "senha");
		 return ResponseEntity.ok().body(u);
	}
}

