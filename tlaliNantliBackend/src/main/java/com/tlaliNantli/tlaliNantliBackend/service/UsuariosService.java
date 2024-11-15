package com.tlaliNantli.tlaliNantliBackend.service;

import java.util.Set;

import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;

public interface UsuariosService
{
	Usuarios crearUsuario(Usuarios usuarios);
	Usuarios getUsuarioById(Long id);
	Usuarios getUsuarioByCorreo(String correo);
	Set<Usuarios> getUsuarios(boolean isActive);
	Usuarios editarUsuario(Usuarios usuario,Long id);
	void borrarUsuario(Long id);
}
