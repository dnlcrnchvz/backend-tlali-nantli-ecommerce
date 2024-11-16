package com.tlaliNantli.tlaliNantliBackend.model;

import jakarta.persistence.*;

// Añadimos una tabla con nombre explícito
@Entity
@Table(name = "productos")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	@Column(nullable = false) 
	private Double precio;
	private String descripcion;
	private Integer stock;

	// Relación con la categoría
	@ManyToOne
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categorias categoria;

	// Constructor vacío requerido por JPA
	public Productos() {
	}

	// Constructor con parámetros (sin incluir ID, ya que es autogenerado)
	public Productos(String nombre, Double precio, String descripcion, Integer stock, Categorias categoria) {
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.stock = stock;
		this.categoria = categoria;
	}

	// Getters y setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto{" + "id=" + id + ", nombre='" + nombre + '\'' + ", precio=" + precio + ", descripcion='"
				+ descripcion + '\'' + ", stock=" + stock + ", categoria=" + categoria + '}';
	}
}