package com.tlaliNantli.tlaliNantliBackend.controller;
import com.tlaliNantli.tlaliNantliBackend.model.EstadoCompra;
import com.tlaliNantli.tlaliNantliBackend.service.EstadoCompraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/estado_compra")
@CrossOrigin(origins = "*")
public class EstadoCompraController {

    private final EstadoCompraService estadoCompraService;

    public EstadoCompraController(EstadoCompraService estadoCompraService) {
        this.estadoCompraService = estadoCompraService;
    }

    // Obtener todos los estados de compra
    @GetMapping
    public ResponseEntity<List<EstadoCompra>> getAllEstadosCompra() {
        List<EstadoCompra> estados = estadoCompraService.getAllEstadosCompra();
        return ResponseEntity.ok(estados);
    }

    // Obtener un estado de compra por ID
    @GetMapping("/{id}")
    public ResponseEntity<EstadoCompra> getEstadoCompraById(@PathVariable Integer id) {
        EstadoCompra estado = estadoCompraService.getEstadoCompraById(id);
        return ResponseEntity.ok(estado);
    }

    // Crear un nuevo estado de compra
    @PostMapping
    public ResponseEntity<EstadoCompra> createEstadoCompra(@RequestBody EstadoCompra estadoCompra) {
        EstadoCompra nuevoEstado = estadoCompraService.createEstadoCompra(estadoCompra);
        return ResponseEntity.status(201).body(nuevoEstado);
    }

    // Actualizar un estado de compra por ID
    @PutMapping("/{id}")
    public ResponseEntity<EstadoCompra> updateEstadoCompra(
            @PathVariable Integer id, @RequestBody EstadoCompra estadoCompra) {
        EstadoCompra estadoActualizado = estadoCompraService.updateEstadoCompra(id, estadoCompra);
        return ResponseEntity.ok(estadoActualizado);
    }

    // Eliminar un estado de compra por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEstadoCompra(@PathVariable Integer id) {
        estadoCompraService.deleteEstadoCompra(id);
        return ResponseEntity.ok("Estado de compra con ID " + id + " eliminado con éxito.");
    }
}