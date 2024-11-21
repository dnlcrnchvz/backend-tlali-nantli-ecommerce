package com.tlaliNantli.tlaliNantliBackend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;
import com.tlaliNantli.tlaliNantliBackend.service.LoginUsuarioService;

@RestController
@RequestMapping("api/v1/inicioSesion")
@CrossOrigin(origins="*")
public class LoginUsuarioController
{
	LoginUsuarioService loginUsuarioService;
	
	public LoginUsuarioController(LoginUsuarioService loginUsuarioService)
	{
		this.loginUsuarioService=loginUsuarioService;
	}
	
	@PostMapping
	ResponseEntity<Usuarios> loginUsuario(@RequestBody Usuarios usuario)
	{
		Usuarios existingUsuario=loginUsuarioService.loginUsuario(usuario);
		return ResponseEntity.ok(existingUsuario);
	}
}
