package com.tlaliNantli.tlaliNantliBackend.service;

import com.tlaliNantli.tlaliNantliBackend.model.Productos;

import java.util.List;

public interface ProductosService {

	List<Productos> obtenerTodosLosProductos(Long id);

	Productos obtenerProductoPorId(Long id);

	Productos guardarProducto(Productos producto);

	void eliminarProducto(Long id);

	Productos crearProducto(Productos nuevoProducto);

	Productos actualizarProducto(Long id, Productos productoActualizado);

	List<Productos> obtenerTodosLosProductos();
}
