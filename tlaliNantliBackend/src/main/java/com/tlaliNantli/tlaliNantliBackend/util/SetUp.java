package com.tlaliNantli.tlaliNantliBackend.util;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tlaliNantli.tlaliNantliBackend.model.Compras;
import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;
import com.tlaliNantli.tlaliNantliBackend.repository.ComprasRepository;
import com.tlaliNantli.tlaliNantliBackend.repository.UsuariosRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tlaliNantli.tlaliNantliBackend.model.Compras;
import com.tlaliNantli.tlaliNantliBackend.repository.ComprasRepository;

public class SetUp 
{

	@Autowired
	ComprasRepository repository;
	@Autowired
	UsuariosRepository repositoryUsuarios;
	// agregar los otros repositorios con numero, ejem usuariosRepository
	// repository1, asi sucesivamente

	public void run(String nombre, String apellidoP, String apellidoM, String telefono, String correo, String contrasenia, Long id, String... args) throws Exception
	{
		//=========Usarios=========
		//Crear nuevo reistro de usuario
		repositoryUsuarios.save(new Usuarios(nombre,apellidoP,apellidoM,telefono,correo,contrasenia));
		//Recuperar todos los usuarios
		List<Usuarios> usuarios=(List<Usuarios>)repositoryUsuarios.findAll();
		
		//Imprimir todos los usuarios
		for(Usuarios usuario:usuarios)
		{
			System.out.println(usuario);
		}
		
		//Recuperar un usuario por su correo
		Optional<Usuarios> optionalUsuario=repository.findByCorreo(correo);
		if(optionalUsuario.isPresent())
		{
			Usuarios usuario=optionalUsuario.get();
			System.out.println(usuario);
			
			//Para modificar un usuario
			usuario.setNombre(nombre);
			usuario.setApellidoP(apellidoP);
			usuario.setApellidoM(apellidoM);
			usuario.setTelefono(telefono);
			usuario.setContrasenia(contrasenia);
		}
		else
		{
			System.out.println("El usuario con el correo "+correo+" no se encuentra registrado");
		}
		
		//Eliminar un usuario
		repositoryUsuarios.deleteById(id);
		
		// ======== COMPRAS =======
		// añadiendo algunas compras, no tienen atributos ya que aun no se crean los
		// estados de las compras
		repository.save(new Compras());
		repository.save(new Compras());
		repository.save(new Compras());
		repository.save(new Compras());
		Optional<Compras> compras = repository.findById(1L);
	}

}
