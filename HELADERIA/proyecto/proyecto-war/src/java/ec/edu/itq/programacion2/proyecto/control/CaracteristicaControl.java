/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyecto.control;

import ec.edu.itq.programacion2.proyacto.modelo.Caracteristica;
import ec.edu.itq.programacion2.proyacto.servicio.CaracteristicaServicio;
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
public class CaracteristicaControl {
    
    @EJB
    private CaracteristicaServicio caracteristicaServicio;

 private String nombre;
 private String descripcion;
 private short cantidad;
 private List<Caracteristica>listCaracteristica;
 
 @PostConstruct
 public void init(){
     buscarCaracteristicas();
 }
 
 public void buscarCaracteristicas(){
     listCaracteristica = caracteristicaServicio.buscarCaracteristica();
 }
 
 
 public void guardar(){
     System.out.println("SI LLEGA AL BOTON");
     Caracteristica caracteristicaNueva = new Caracteristica();
     caracteristicaNueva.setNombre(nombre);
     caracteristicaNueva.setDescripcion(descripcion);
     caracteristicaNueva.setCantidad(cantidad);
     caracteristicaNueva.setIdCaracteristica(1);
     caracteristicaServicio.guardar(caracteristicaNueva);
     
     
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

    public List<Caracteristica> getListCaracteristica() {
        return listCaracteristica;
    } 

}
