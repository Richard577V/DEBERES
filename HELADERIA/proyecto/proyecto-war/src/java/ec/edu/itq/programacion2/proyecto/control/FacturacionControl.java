/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyecto.control;

import ec.edu.itq.programacion2.proyacto.modelo.Facturacion;
import ec.edu.itq.programacion2.proyacto.servicio.FacturacionServicio;
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
public class FacturacionControl {
    
    @EJB
    private FacturacionServicio facturacionServicio;

private Integer precio ;
private Integer subtotal;
private Integer servicio;
private Integer total;
private Integer iva;

@PostConstruct
public void init(){
    buscarFacturcion();
}
public void buscarFacturcion(){
    
}

public void guardar(){
    System.out.println("SI LLEGA AL BOTON");
    Facturacion facturacionNueva = new Facturacion();
    facturacionNueva.setIdFacturacion(1);
    facturacionNueva.setIdCliente(null);
    facturacionNueva.setIdVenta(null);
    facturacionNueva.setPrecio(precio);
    facturacionNueva.setSubtotal(subtotal);
    facturacionNueva.setServicio(servicio);
    facturacionNueva.setIva(iva);
   facturacionServicio.guardar(facturacionNueva);
    limpiar();
}
   private void limpiar(){
        precio=null;
        subtotal=null;
        servicio=null;
        total=null;
        iva= null;
    }
    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getServicio() {
        return servicio;
    }

    public void setServicio(Integer servicio) {
        this.servicio = servicio;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getIva() {
        return iva;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }


    
}
