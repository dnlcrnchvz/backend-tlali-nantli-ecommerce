package com.tlaliNantli.tlaliNantliBackend.service.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.tlaliNantli.tlaliNantliBackend.model.EstadoCompra;
import com.tlaliNantli.tlaliNantliBackend.repository.EstadoCompraRepository;
import com.tlaliNantli.tlaliNantliBackend.service.EstadoCompraService;

@Service
public class EstadoCompraServiceImpl implements EstadoCompraService {

    private final EstadoCompraRepository estadoCompraRepository;

    
    public EstadoCompraServiceImpl(EstadoCompraRepository estadoCompraRepository) {
        this.estadoCompraRepository = estadoCompraRepository;
    }

    @Override
    public List<EstadoCompra> getAllEstadosCompra() {
        return estadoCompraRepository.findAll();
    }

    @Override
    public EstadoCompra getEstadoCompraById(int id) {
        Optional<EstadoCompra> estadoCompra = estadoCompraRepository.findById(id);
        return estadoCompra.orElse(null); 
    }

    @Override
    public EstadoCompra createEstadoCompra(EstadoCompra estadoCompra) {
        return estadoCompraRepository.save(estadoCompra);
    }

    @Override
    public EstadoCompra updateEstadoCompra(int id, EstadoCompra estadoCompra) {
        if (estadoCompraRepository.existsById(id)) {
            estadoCompra.setIdEstado(id);
            return estadoCompraRepository.save(estadoCompra);
        } else {
            return null;
        }
    }

    @Override
    public void deleteEstadoCompra(int id) {
        if (estadoCompraRepository.existsById(id)) {
            estadoCompraRepository.deleteById(id);
        }
    }
}

