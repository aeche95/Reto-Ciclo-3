package com.ciclo3.reto.Interfaces;

import org.springframework.data.repository.CrudRepository;

import com.ciclo3.reto.Modelos.ProductoModel;

public interface ProductosRepository extends CrudRepository<ProductoModel,Long> {

}
