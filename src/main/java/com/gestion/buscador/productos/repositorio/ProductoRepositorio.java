package com.gestion.buscador.productos.repositorio;

import com.gestion.buscador.productos.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> { //el ID es de tipo Long

//para la parte del buscador
    
    @Query("SELECT p FROM Producto p WHERE"
    + " CONCAT(p.id, p.nombre, p.marca,p, hechoEn,p.precio)"
    + " LIKE %?1%")
    public List<Producto> findAll(String palabraClave);
}
