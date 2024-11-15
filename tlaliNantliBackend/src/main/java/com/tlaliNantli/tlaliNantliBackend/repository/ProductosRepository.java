package com.tlaliNantli.tlaliNantliBackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.tlaliNantli.tlaliNantliBackend.model.Producto;
import com.tlaliNantli.tlaliNantliBackend.model.Categorias;

public interface ProductosRepository extends CrudRepository<Producto, Long> {

	// Buscar producto por nombre
	Optional<Producto> findByNombre(String nombre);

	// Buscar productos por categoría
	List<Producto> findByCategoria(Categorias categoria);

	// Buscar productos con stock menor a un valor
	List<Producto> findByStockLessThan(Integer stock);

	// Consultas personalizadas

	// Buscar productos dentro de un rango de precio
	@Query("SELECT p FROM Producto p WHERE p.precio BETWEEN :minPrice AND :maxPrice")
	List<Producto> findByPrecioBetween(@Param("minPrice") Double minPrice, @Param("maxPrice") Double maxPrice);

}