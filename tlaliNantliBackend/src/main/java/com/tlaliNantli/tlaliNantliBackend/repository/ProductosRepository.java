package com.tlaliNantli.tlaliNantliBackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tlaliNantli.tlaliNantliBackend.model.Productos;
import com.tlaliNantli.tlaliNantliBackend.model.Categorias;

public interface ProductosRepository extends CrudRepository<Productos, Long> {

	// Buscar producto por nombre
	Optional<Productos> findByNombre(String nombre);

	// Buscar productos por categoría
	List<Productos> findByCategoria(Categorias categoria);

	// Buscar productos con stock menor a un valor
	List<Productos> findByStockLessThan(Integer stock);

	// Consultas personalizadas

	// Buscar productos dentro de un rango de precio
	//@Query("SELECT p FROM Producto p WHERE p.precio BETWEEN :minPrice AND :maxPrice")
	List<Productos> findByPrecioBetween(@Param("minPrice") Double minPrice, @Param("maxPrice") Double maxPrice);

	List<Productos> findAll();

}