package com.tlaliNantli.tlaliNantliBackend.service;

import java.util.List;
import com.tlaliNantli.tlaliNantliBackend.model.EstadoCompra;

public interface EstadoCompraService {

    // Método para obtener todos los estados de compra
    List<EstadoCompra> getAllEstadosCompra();

    // Método para obtener un estado de compra por su ID
    EstadoCompra getEstadoCompraById(int id);

    // Método para crear un nuevo estado de compra
    EstadoCompra createEstadoCompra(EstadoCompra estadoCompra);

    // Método para actualizar un estado de compra existente
    EstadoCompra updateEstadoCompra(int id, EstadoCompra estadoCompra);

    // Método para eliminar un estado de compra por su ID
    void deleteEstadoCompra(int id);
}
