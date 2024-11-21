package com.tlaliNantli.tlaliNantliBackend.service;

import java.util.Set;

import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;

public interface UsuariosService {
	Usuarios crearUsuario(Usuarios usuario);

	Usuarios getUsuarioById(Long id);

	Usuarios getUsuarioByCorreo(String correo);

	Set<Usuarios> getUsuarios(boolean isActive);

	Usuarios editarUsuario(Usuarios usuario, String correo);

	void borrarUsuario(String correo);
}
