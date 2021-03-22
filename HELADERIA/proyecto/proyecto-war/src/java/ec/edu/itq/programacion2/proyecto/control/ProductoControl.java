/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyecto.control;

import ec.edu.itq.programacion2.proyacto.modelo.Producto;
import ec.edu.itq.programacion2.proyacto.servicio.ProductoServicio;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author RICHARD
 */
@ManagedBean
@ViewScoped
public class ProductoControl {
    
    @EJB
    private ProductoServicio productoServicio;

  private String nombre;
  private Boolean estado;
  private short categoria;
  private String descripcion;
  
  public void guardar(){
      System.out.println("SI LLEGA AL BOTON");
      Producto productoNueva = new Producto();
      productoNueva.setNombre(nombre);
      productoNueva.setEstado(estado);
      productoNueva.setCategoria(categoria);
      productoNueva.setDescripcion(descripcion);
      productoNueva.setIdCaracteristica(null);
      productoNueva.setIdGestionBodega(null);
      productoNueva.setIdProducto(1);
      productoServicio.guardar(productoNueva);
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public short getCategoria() {
        return categoria;
    }

    public void setCategoria(short categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
  
  
  
}
