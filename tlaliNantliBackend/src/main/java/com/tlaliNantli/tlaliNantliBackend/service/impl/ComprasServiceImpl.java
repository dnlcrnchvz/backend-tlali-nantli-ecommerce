package com.tlaliNantli.tlaliNantliBackend.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.tlaliNantli.tlaliNantliBackend.model.Compras;
import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;
import com.tlaliNantli.tlaliNantliBackend.repository.ComprasRepository;
import com.tlaliNantli.tlaliNantliBackend.service.ComprasService;

@Service
public class ComprasServiceImpl implements ComprasService {

	ComprasRepository comprasRepository;

	public ComprasServiceImpl(ComprasRepository comprasRepository) {
		this.comprasRepository = comprasRepository;
	}

	@Override
	public Compras createOrder(Compras Compra) {
		// verificar si existe la compra
		Optional<Compras> optionalOrder = comprasRepository.findById(Compra.getId());
		if (optionalOrder.isPresent()) {
			throw new IllegalStateException("La compra esta registrada con el ID: " + Compra.getId());
		}
		Compras nuevaCompra = comprasRepository.save(Compra);
		return nuevaCompra;
	}

	@Override
	public Compras updateOrder(Compras Compra, Long id) {
		// TODO atributos a cambiar
		Compras compraExistente = getOrderById(id);
		compraExistente.setId(Compra.getId());
		compraExistente.setEstado(Compra.getEstado());
		// fecha y usuario no se permiten modificar
		return comprasRepository.save(compraExistente);
	}

	@Override
	public void deleteOrder(Long id) {
		Compras compraExistente = getOrderById(id);
		compraExistente.setActive(false);
		comprasRepository.save(compraExistente);

	}

	@Override
	public Compras getOrderById(Long id) {
		Optional<Compras> optionalOrder = comprasRepository.findById(id);
		if (optionalOrder.isEmpty()) {
			throw new IllegalStateException("No existe una orden de compra con el id " + id);
		}
		Compras compraExistente = optionalOrder.get();
		return compraExistente;
	}

	@Override
	public Compras getOrderByUser(Usuarios usuario) {
		Optional<Compras> optionalOrder = comprasRepository.findByUsuario(usuario);
		if (optionalOrder.isEmpty()) {
			throw new IllegalStateException("No existe una orden de compra del usuario " + usuario);
		}
		Compras compraExistente = optionalOrder.get();
		return compraExistente;
	}

	@Override
	public Set<Compras> getAllOrders(boolean isActive) {
		Set<Compras> compras;
		if (isActive) {
			compras = comprasRepository.findAllByActiveTrue();
		} else {
			compras = comprasRepository.findAllByActiveFalse();
		}
		return compras;
	}
}
