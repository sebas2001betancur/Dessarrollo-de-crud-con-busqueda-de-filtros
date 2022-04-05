package com.gestion.buscador.productos.servicio;

import com.gestion.buscador.productos.modelo.Producto;
import com.gestion.buscador.productos.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    //metodo para listar y buscar
    public List<Producto> listAll(String palabraClave) {  //listar todos
        if(palabraClave != null){
            return productoRepositorio.findAll(palabraClave);
        }
        return productoRepositorio.findAll();
    }

    //metodo para guardar
    public void save(Producto producto) {
        productoRepositorio.save(producto);
    }
    //para obtener un solo producto
    public Producto get(Long id) {
        return productoRepositorio.findById(id).get();
    }

    public void delete(Long id) {
        productoRepositorio.deleteById(id);
    }
}
