package com.tlaliNantli.tlaliNantliBackend.service;

import java.util.Set;

import com.tlaliNantli.tlaliNantliBackend.model.Compras;
import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;

public interface ComprasService {
Compras createOrder (Compras Compra);
Compras updateOrder (Compras Compra, Long id);
void deleteOrder (Long id);
Compras getOrderById (Long id);
Compras getOrderByUser (Usuarios usuario);
Set<Compras> getAllOrders(boolean isActive);

}
