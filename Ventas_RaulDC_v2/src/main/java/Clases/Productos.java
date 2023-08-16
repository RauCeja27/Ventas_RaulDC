/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author rauli
 */
public class Productos {
    
    //@JsonProperty
    private Integer idprod;
    //@JsonProperty
    private String nombre;
    //@JsonProperty
    private String marca;
    //@JsonProperty
    private String presentacion;
    //@JsonProperty
    private Integer precio;

    public Integer getIdprod() {
        return idprod;
    }

    public void setIdprod(Integer idprod) {
        this.idprod = idprod;
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

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }


 
    
    
}
