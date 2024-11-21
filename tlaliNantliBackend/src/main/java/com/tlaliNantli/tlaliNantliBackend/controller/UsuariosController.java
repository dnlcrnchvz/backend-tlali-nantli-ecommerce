package com.tlaliNantli.tlaliNantliBackend.controller;

import java.util.Set;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;
import com.tlaliNantli.tlaliNantliBackend.service.UsuariosService;

@CrossOrigin(origins="*")
@Controller
@ResponseBody
@RequestMapping("/api/v1/usuarios")
public class UsuariosController
{
	UsuariosService usuariosService;
	
	public UsuariosController(UsuariosService usuariosService)
	{
		this.usuariosService=usuariosService;
	}
	
	//Recuperar registro que coincida con el correo
	@GetMapping({"correo"})//http://localhost:8081/api/v1/usuarios
	Usuarios getUsuariosByCorreo(@PathVariable("correo")String correo)
	{
		Usuarios usuarioExistente=usuariosService.getUsuarioByCorreo(correo);
		
		return usuarioExistente;
	}
	
	@GetMapping
	Set<Usuarios> obtenerTodosLosUsuarios(@RequestParam(name="active",required=false,defaultValue="true") boolean active)
	{
		return usuariosService.getUsuarios(active);
	}
	
	//crear nuevo usuario
	@PostMapping //http://localhost:8081/api/v1/usuarios
	ResponseEntity<Usuarios> crearUsuarios(@RequestBody Usuarios nuevoUsuario)
	{
		Usuarios registrarUsuario=usuariosService.crearUsuario(nuevoUsuario);
		return ResponseEntity.status(201).body(registrarUsuario);
	}
	
	//editar un registro existente
	@PutMapping("{correo}")//http://localhost:8081/api/v1/usuarios/{correo}
	ResponseEntity<Usuarios> actualizarUsuario(@PathVariable("correo")String correo,@RequestBody Usuarios usuario)
	{
		Usuarios actualizarUsuario=usuariosService.editarUsuario(usuario,correo);
		return ResponseEntity.ok(actualizarUsuario);
	}
	
	//Eliminar usuario
	@DeleteMapping("{correo}")//http://localhost:8081/api/v1/usuarios/{correo}
	ResponseEntity<String> borrarUsuario(@PathVariable("correo")String correo)
	{
		usuariosService.borrarUsuario(correo);
		return ResponseEntity.ok("El usuario registrado con el correo "+correo+" se ha eliminado exitosamente.");
	}
}
