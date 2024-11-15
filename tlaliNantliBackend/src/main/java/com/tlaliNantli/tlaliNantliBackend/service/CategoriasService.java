package com.tlaliNantli.tlaliNantliBackend.service;

import com.tlaliNantli.tlaliNantliBackend.model.Categorias;
import java.util.List;

public interface CategoriasService {
    List<Categorias> listarCategorias();
    Categorias guardarCategoria(Categorias categoria);
    Categorias obtenerCategoriaPorId(int id);
    void eliminarCategoria(int id);
}