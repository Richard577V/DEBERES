/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyecto.control;

import ec.edu.itq.programacion2.proyacto.modelo.GestionBodega;
import ec.edu.itq.programacion2.proyacto.servicio.GestionBodegaServicio;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author RICHARD
 */
@ManagedBean
@ViewScoped
public class GestionBodegaControl {
    
    @EJB
    private GestionBodegaServicio gestionBodegaServicio;

 private String nombre;
private String descripcion;
private short cantidad;
private Boolean estado;
private List<GestionBodega>listGestionBodega;

@PostConstruct
public void ini(){
    buscarGestionBodega();
}

public void buscarGestionBodega(){
    listGestionBodega = gestionBodegaServicio.buscarGestionBodega();
}


public void guardar(){
    System.out.println("SI LLEGA AL BOTON");
    GestionBodega bodegaNueva = new GestionBodega();
    bodegaNueva.setNombre(nombre);
    bodegaNueva.setDescripcion(descripcion);
    bodegaNueva.setCantidad(cantidad);
    bodegaNueva.setEstado(estado);
    bodegaNueva.setIdGestionBodega(1);
    gestionBodegaServicio.guardar(bodegaNueva);
    limpiar();
}
private void limpiar(){
    nombre = "";
    descripcion = "";
    estado = null;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getCantidad() {
        return cantidad;
    }

    public void setCantidad(short cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<GestionBodega> getListGestionBodega() {
        return listGestionBodega;
    }

}
