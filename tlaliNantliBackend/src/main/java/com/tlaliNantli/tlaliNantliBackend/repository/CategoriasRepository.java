package com.tlaliNantli.tlaliNantliBackend.repository;

import com.tlaliNantli.tlaliNantliBackend.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {
}