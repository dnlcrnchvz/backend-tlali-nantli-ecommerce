package com.tlaliNantli.tlaliNantliBackend.service.impl;

import java.util.Optional;
import java.util.Set;

import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;
import com.tlaliNantli.tlaliNantliBackend.repository.UsuariosRepository;
import com.tlaliNantli.tlaliNantliBackend.service.UsuariosService;

public class UsuariosServiceImpl implements UsuariosService {
	// Inyección de dependencia
	UsuariosRepository usuarioRepository;

	@Override
	public Usuarios crearUsuario(Usuarios usuarios) {
		// Validar si ya existe un usuario registrado con el correo
		Optional<Usuarios> optionalUsuario = usuarioRepository.findByCorreo(usuarios.getCorreo());

		if (optionalUsuario.isPresent()) {
			throw new IllegalStateException(
					"Ya se encuentra registrado un usuario con el correo " + usuarios.getCorreo());
		}

		// TODO validar que el campo nombre no tenga carácteres especiales

		// TODO validar que el campo apellido paterno no tenga carácteres especiales

		// TODO validar que el campo apellido materno no tenga carácteres especiales

		// TODO validar que el telefono tenga solo carácteres númericos

		// TODO validar que el correo tenga el formato correcto

		// TODO validar que la contraseña cumpla las especificaciones

		usuarios.setId(null);// Se fuerza a crear un nuevo registro

		usuarios.setActivo(true);// Poner como activo el nuevo registro

		Usuarios nuevoUsuario = usuarioRepository.save(usuarios);

		return nuevoUsuario;
	}

	@Override
	public Usuarios getUsuarioById(Long id) {
		Optional<Usuarios> optionalUsuario = usuarioRepository.findById(id);

		if (optionalUsuario.isEmpty()) {
			throw new IllegalStateException("El usuario no se encuentra registrado");
		}
		return null;
	}

	@Override
	public Usuarios getUsuarioByCorreo(String correo) {
		Optional<Usuarios> optionalUsuario = usuarioRepository.findByCorreo(correo);
		if (optionalUsuario.isEmpty()) {
			throw new IllegalStateException("No se encuentra un usuario registrado con el correo " + correo);
		}

		return optionalUsuario.get();
	}

	@Override
	public Set<Usuarios> getUsuarios(boolean isActive) {
		Set<Usuarios> usuarios;
		if (isActive) {
			usuarios = usuarioRepository.findUsuariosActivos();
		} else {
			usuarios = usuarioRepository.findUsuariosInactivos();
		}
		return null;
	}

	@Override
	public Usuarios editarUsuario(Usuarios usuario, Long id) {
		// TODO colocar los atributos que se podrán editar
		return null;
	}

	@Override
	public void borrarUsuario(Long id) {
		Usuarios usuarioExistente = getUsuarioById(id);
		usuarioExistente.setActivo(false);// Se cambia a inactivo el usuario
		usuarioRepository.save(usuarioExistente);
	}

}
