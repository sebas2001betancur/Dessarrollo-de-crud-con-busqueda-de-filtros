package com.gestion.buscador.productos.modelo;

import javax.persistence.*;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//identity es para indicar que este campo va a ser autoincrementable
    private Long Id;

    @Column(nullable = false, length = 60)
    private String nombre;

    @Column(nullable = false, length = 60)
    private String marca;

    @Column(nullable = false, length = 60)
    private String hechoEn;

    @Column(nullable = false, length = 60)
    private float precio;

    public Producto(Long id, String nombre, String marca, String hechoEn, float precio) {
        super();
        Id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.hechoEn = hechoEn;
        this.precio = precio;
    }

    public Producto() {
        super();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHechoEn() {
        return hechoEn;
    }

    public void setHechoEn(String hechoEn) {
        this.hechoEn = hechoEn;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
