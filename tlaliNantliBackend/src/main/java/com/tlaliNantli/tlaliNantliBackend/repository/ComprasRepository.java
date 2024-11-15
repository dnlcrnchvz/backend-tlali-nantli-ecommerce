package com.tlaliNantli.tlaliNantliBackend.repository;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import com.tlaliNantli.tlaliNantliBackend.model.Compras;
import com.tlaliNantli.tlaliNantliBackend.model.EstadoCompra;
import com.tlaliNantli.tlaliNantliBackend.model.Usuarios;

public interface ComprasRepository extends CrudRepository<Compras, Long> {
Optional <Compras> findById (Long id);
Optional <Compras> findByDate (Date fecha);
Optional <Compras> findByUser (Usuarios usuario);
Optional <Compras> findByState (EstadoCompra estado);
Set<Compras> findAllByActiveFalse();
Set<Compras> findAllByActiveTrue();

}
