package com.tlaliNantli.tlaliNantliBackend.service.impl;

import com.tlaliNantli.tlaliNantliBackend.model.Producto;
import com.tlaliNantli.tlaliNantliBackend.repository.ProductoRepository;
import com.tlaliNantli.tlaliNantliBackend.repository.ProductosRepository;
import com.tlaliNantli.tlaliNantliBackend.service.ProductoService;
import com.tlaliNantli.tlaliNantliBackend.service.ProductosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosRepository productoRepository;

	@Override
	public List<Producto> obtenerTodosLosProductos() {
		return (List<Producto>) productoRepository.findAll();
	}

	@Override
	public Producto obtenerProductoPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarProducto(Long id) {
		// TODO Auto-generated method stub

	}
}