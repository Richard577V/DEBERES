/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyecto.control;

import ec.edu.itq.programacion2.proyacto.modelo.Venta;
import ec.edu.itq.programacion2.proyacto.servicio.VentaServicio;
import java.util.Date;
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
public class VentaControl {

    @EJB
    private VentaServicio ventaServicio;
    
  private short cantidad_venta;
  private Date fecha_ventas;
  private Boolean estado;
  private Integer precio;
  
  @PostConstruct
public void init(){
    
}
public void guardar(){
    System.out.println("SI LLEGA AL BOTON");
    Venta ventaNueva = new Venta();
    ventaNueva.setCantidadVentas(cantidad_venta);
    ventaNueva.setFechaVentas(fecha_ventas);
    ventaNueva.setEstado(true);
    ventaNueva.setPrecio(precio);
    ventaServicio.guardar(ventaNueva);
}

  public void BuscarVenta(){
      
  }
    public short getCantidad_venta() {
        return cantidad_venta;
    }

    public void setCantidad_venta(short cantidad_venta) {
        this.cantidad_venta = cantidad_venta;
    }

    public Date getFecha_ventas() {
        return fecha_ventas;
    }

    public void setFecha_ventas(Date fecha_ventas) {
        this.fecha_ventas = fecha_ventas;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
  
  
}
