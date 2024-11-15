package com.tlaliNantli.tlaliNantliBackend.controller;

import com.tlaliNantli.tlaliNantliBackend.model.Categorias;
import com.tlaliNantli.tlaliNantliBackend.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriasController {

    @Autowired
    private CategoriasService categoriasService;

    @GetMapping
    public List<Categorias> listarCategorias() {
        return categoriasService.listarCategorias();
    }

    @PostMapping
    public Categorias guardarCategoria(@RequestBody Categorias categoria) {
        return categoriasService.guardarCategoria(categoria);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorias> obtenerCategoriaPorId(@PathVariable int id) {
        Categorias categoria = categoriasService.obtenerCategoriaPorId(id);
        if (categoria != null) {
            return new ResponseEntity<>(categoria, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable int id) {
        categoriasService.eliminarCategoria(id);
    }
}