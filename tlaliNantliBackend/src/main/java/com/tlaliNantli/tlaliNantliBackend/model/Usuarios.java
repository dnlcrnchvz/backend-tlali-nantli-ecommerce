package com.tlaliNantli.tlaliNantliBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios") //Tabla usuarios
public class Usuarios
{
	//Se indican los atributos que se tienen en la tabla usuarios dentro de la BD
	@Id//Atributo llave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY)//Llave primaria autoincrementable
	private Long id;
	@Column(name="nombre",length=45,nullable=false)
	private String nombre;
	@Column(name="apellido_paterno",length=45,nullable=false)
	private String apellidoP;
	@Column (name="apellido_materno",length=45,nullable=false)
	private String apellidoM;
	@Column(name="telefono",length=10,nullable=false)
	private String telefono;
	@Column(name="correo",length=45,nullable=false)
	private String correo;
	@Column(name="contrasenia",length=16,nullable=false)
	private String contrasenia;
	@Column(name="administracion",nullable=false)
	private boolean administracion;
	
	//Constructores
	protected Usuarios() {}
	public Usuarios(String nombre,String apellidoP,String apellidoM,String telefono,String correo,String contrasenia,boolean administracion)
	{
		this.nombre=nombre;
		this.apellidoP=apellidoP;
		this.apellidoM=apellidoM;
		this.telefono=telefono;
		this.correo=correo;
		this.contrasenia=contrasenia;
		this.administracion=administracion;
	}
	
	//get/set id
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	
	//get/set nombre
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	//get/set apellidoP
	public String getApellidoP()
	{
		return apellidoP;
	}
	public void setApellidoP(String apellidoP)
	{
		this.apellidoP = apellidoP;
	}
	
	//get/set apellidoM
	public String getApellidoM()
	{
		return apellidoM;
	}
	public void setApellidoM(String apellidoM)
	{
		this.apellidoM = apellidoM;
	}
	
	//get/set telefono
	public String getTelefono()
	{
		return telefono;
	}
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
	
	//get/set correo
	public String getCorreo()
	{
		return correo;
	}
	public void setCorreo(String correo)
	{
		this.correo = correo;
	}
	
	//get/set contrasenia
	public String getContrasenia()
	{
		return contrasenia;
	}
	public void setContrasenia(String contrasenia)
	{
		this.contrasenia = contrasenia;
	}
	
	//get/set administracion
	public boolean isAdministracion()
	{
		return administracion;
	}
	public void setAdministracion(boolean administracion)
	{
		this.administracion = administracion;
	}
	
	//toString con todos los atributos
	@Override
	public String toString()
	{
		return "Usuarios [id=" + id 
				+ ", nombre=" + nombre
				+ ", apellidoP=" + apellidoP 
				+ ", apellidoM=" + apellidoM 
				+ ", telefono=" + telefono 
				+ ", correo=" + correo 
				+ ", contrasenia=" + contrasenia 
				+ ", administracion=" + administracion + "]";
	}
	
}
