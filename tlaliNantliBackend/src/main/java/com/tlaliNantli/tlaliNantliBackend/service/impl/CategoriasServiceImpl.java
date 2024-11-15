package com.tlaliNantli.tlaliNantliBackend.service.impl;

import com.tlaliNantli.tlaliNantliBackend.model.Categorias;
import com.tlaliNantli.tlaliNantliBackend.repository.CategoriasRepository;
import com.tlaliNantli.tlaliNantliBackend.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasServiceImpl implements CategoriasService {

    @Autowired
    private CategoriasRepository categoriasRepository;

    @Override
    public List<Categorias> listarCategorias() {
        return categoriasRepository.findAll();
    }

    @Override
    public Categorias guardarCategoria(Categorias categoria) {
        return categoriasRepository.save(categoria);
    }

    @Override
    public Categorias obtenerCategoriaPorId(int id) {
        return categoriasRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCategoria(int id) {
        categoriasRepository.deleteById(id);
    }
}