package com.tlaliNantli.tlaliNantliBackend.util;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tlaliNantli.tlaliNantliBackend.model.Compras;
import com.tlaliNantli.tlaliNantliBackend.repository.ComprasRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tlaliNantli.tlaliNantliBackend.model.Compras;
import com.tlaliNantli.tlaliNantliBackend.repository.ComprasRepository;

public class SetUp
{

    @Autowired
    ComprasRepository repository;
    //agregar los otros repositorios con numero, ejem usuariosRepository repository1, asi sucesivamente

    public void run(String... args) throws Exception{
        
        
        
        
        
    // ======== COMPRAS =======
    //añadiendo algunas compras, no tienen atributos ya que aun no se crean los estados de las compras
    repository.save(new Compras ());
    repository.save(new Compras ());
    repository.save(new Compras ());
    repository.save(new Compras ());
    Optional<Compras> compras = repository.findById(1L);
    }
        

    @Autowired
    ComprasRepository repository;
    //agregar los otros repositorios con numero, ejem usuariosRepository repository1, asi sucesivamente

    public void run(String... args) throws Exception{
        
        
        
        
        
    // ======== COMPRAS =======
    //añadiendo algunas compras, no tienen atributos ya que aun no se crean los estados de las compras
    repository.save(new Compras ());
    repository.save(new Compras ());
    repository.save(new Compras ());
    repository.save(new Compras ());
    Optional<Compras> compras = repository.findById(1L);
}
	

}
