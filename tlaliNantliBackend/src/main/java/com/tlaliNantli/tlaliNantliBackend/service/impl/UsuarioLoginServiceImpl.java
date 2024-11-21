package com.tlaliNantli.tlaliNantliBackend.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;
import com.tlaliNantli.tlaliNantliBackend.repository.UsuariosRepository;
import com.tlaliNantli.tlaliNantliBackend.service.LoginUsuarioService;

@Service
public class UsuarioLoginServiceImpl implements LoginUsuarioService 
{
	// Inyección de dependencia
	@Autowired
	UsuariosRepository usuariosRespository;

	@Override
	public Usuarios loginUsuario(Usuarios usuario)
	{
		String correo=usuario.getCorreo();
		Optional<Usuarios> optionalUsuario=usuariosRespository.findByCorreo(correo);
		
		if(optionalUsuario.isPresent())
		{
			Usuarios existingUsuario=optionalUsuario.get();
			if(existingUsuario.getContrasenia().equals(usuario.getContrasenia()))
			{
				return existingUsuario;
			}
		}
		
		throw new IllegalStateException("Correo o contraseña incorrectos");
	}
}
