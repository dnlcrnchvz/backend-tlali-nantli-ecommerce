package com.tlaliNantli.tlaliNantliBackend.controller;

import com.tlaliNantli.tlaliNantliBackend.model.Productos;
import com.tlaliNantli.tlaliNantliBackend.service.ProductosService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos") // Consistencia en rutas
public class ProductosController {

	private final ProductosService productoService;

	// Inyección de dependencias por constructor
	public ProductosController(ProductosService productoService) {
		this.productoService = productoService;
	}

	// Obtener todos los productos
	@GetMapping
	public ResponseEntity<List<Productos>> obtenerTodosLosProductos() {
		List<Productos> productos = productoService.obtenerTodosLosProductos();
		return ResponseEntity.ok(productos);
	}

	// Obtener un producto por ID
	@GetMapping("/{id}")
	public ResponseEntity<Productos> obtenerProductoPorId(@PathVariable Long id) {
		Productos producto = productoService.obtenerProductoPorId(id);
		return ResponseEntity.ok(producto);
	}

	// Crear un nuevo producto
	@PostMapping
	public ResponseEntity<Productos> crearProducto(@RequestBody Productos nuevoProducto) {
		Productos productoRegistrado = productoService.crearProducto(nuevoProducto);
		return ResponseEntity.status(201).body(productoRegistrado);
	}

	// Actualizar un producto por ID
	@PutMapping("/{id}")
	public ResponseEntity<Productos> actualizarProducto(@PathVariable("id") Long id,
			@RequestBody Productos productoActualizado) {
		Productos productoModificado = productoService.actualizarProducto(id, productoActualizado);
		return ResponseEntity.ok(productoModificado);
	}

	// Eliminar un producto por ID
	@DeleteMapping("/{id}")
	public ResponseEntity<String> eliminarProducto(@PathVariable("id") Long id) {
		productoService.eliminarProducto(id);
		return ResponseEntity.ok("El producto con ID " + id + " fue eliminado con éxito.");
	}
}
