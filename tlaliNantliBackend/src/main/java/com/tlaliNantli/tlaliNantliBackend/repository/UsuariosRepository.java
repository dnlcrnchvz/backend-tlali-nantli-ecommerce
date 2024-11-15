package com.tlaliNantli.tlaliNantliBackend.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;

public interface UsuariosRepository extends CrudRepository<Usuarios, Long> {
	// Consultas de registros por:
	// id
	Usuarios findById(long id);

	// nombre
	List<Usuarios> findByNombre(String nombre);

	// apellido paterno
	List<Usuarios> findByApellidoP(String apellidoP);

	// apellido materno
	List<Usuarios> findByApellidoM(String apellidoM);

	// telefono
	List<Usuarios> findByTelefono(String telefono);

	// correo
	Optional<Usuarios> findByCorreo(String correo);

	// contrasenia
	List<Usuarios> findByContrasenia(String contrasenia);

	// administracion=true
	Set<Usuarios> findByAdministracionTrue();

	// administracion=false
	Set<Usuarios> findByAdministracionFalse();

	// usuarios activos
	Set<Usuarios> findUsuariosActivos();

	// usuarios inactivos
	Set<Usuarios> findUsuariosInactivos();
}