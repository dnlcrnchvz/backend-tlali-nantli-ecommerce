package com.tlaliNantli.tlaliNantliBackend.service.impl;

import com.tlaliNantli.tlaliNantliBackend.model.Producto;
import com.tlaliNantli.tlaliNantliBackend.repository.ProductoRepository;
import com.tlaliNantli.tlaliNantliBackend.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }
}