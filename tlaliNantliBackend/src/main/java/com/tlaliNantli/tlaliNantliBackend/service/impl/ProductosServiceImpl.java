package com.tlaliNantli.tlaliNantliBackend.service.impl;

import com.tlaliNantli.tlaliNantliBackend.model.Productos;
import com.tlaliNantli.tlaliNantliBackend.repository.ProductosRepository;
import com.tlaliNantli.tlaliNantliBackend.service.ProductosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosRepository productoRepository;

	@Override
	public List<Productos> obtenerTodosLosProductos(Long id) {
		return (List<Productos>) productoRepository.findAll();
	}

	@Override
	public Productos obtenerProductoPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void eliminarProducto(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Productos guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos crearProducto(Productos nuevoProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Productos actualizarProducto(Long id, Productos productoActualizado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productos> obtenerTodosLosProductos() {
		// TODO Auto-generated method stub
		return null;
	}
}