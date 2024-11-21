package com.tlaliNantli.tlaliNantliBackend.repository;

import com.tlaliNantli.tlaliNantliBackend.model.Categorias;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {

	Optional<Categorias> findById(Long id);

	void deleteById(Long id);
}