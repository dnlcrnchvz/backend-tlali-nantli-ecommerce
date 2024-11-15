package com.tlaliNantli.tlaliNantliBackend.controller;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tlaliNantli.tlaliNantliBackend.model.Compras;
import com.tlaliNantli.tlaliNantliBackend.service.ComprasService;

@CrossOrigin(origins = "*")
@Controller
@ResponseBody
// @RestController
@RequestMapping("/api/v1/compras") // http:localhost:8080/api/v1/compras
public class ComprasController {
	ComprasService comprasService;

	public ComprasController(ComprasService comprasService) {
		this.comprasService = comprasService;
	}

	@GetMapping({ "id" }) // http:localhost:8080/api/v1/compras/{id}
	Compras getOrderById(@PathVariable Long id) {
		Compras compraExistente = comprasService.getOrderById(id);
		return compraExistente;
	}

	@GetMapping // // http:localhost:8080/api/v1/customers?active=false
	Set<Compras> getAllOrders(@RequestParam(name = "active", required = false, defaultValue = "true") boolean active) {
		return comprasService.getAllOrders(active);
	}

	@PostMapping // http:localhost:8080/api/v1/compras
	ResponseEntity<Compras> createOrder(@RequestBody Compras newOrder) {
		Compras registeredOrder = comprasService.createOrder(newOrder);
		return ResponseEntity.status(201).body(registeredOrder);
	}

	@PutMapping("{id}") // http:localhost:8080/api/v1/compras/{id}
	ResponseEntity<Compras> updateOrder(@PathVariable("id") Long id, @RequestBody Compras compras) {
		Compras updatedOrder = comprasService.updateOrder(compras, id);
		return ResponseEntity.ok(updatedOrder);
	}

	@DeleteMapping({ "id" }) // http:localhost:8080/api/v1/compras/{id}
	ResponseEntity<String> deleteOrder(@PathVariable("id") Long id) {
		comprasService.deleteOrder(id);
		return ResponseEntity.ok("La orden con el id " + id + "fue eliminada con exito.");

	}

}
