package com.tlaliNantli.tlaliNantliBackend.service;

import com.tlaliNantli.tlaliNantliBackend.model.Producto;

import java.util.List;

public interface ProductosService {

	List<Producto> obtenerTodosLosProductos();

	Producto obtenerProductoPorId(Long id);

	Producto guardarProducto(Producto producto);

	void eliminarProducto(Long id);
}
