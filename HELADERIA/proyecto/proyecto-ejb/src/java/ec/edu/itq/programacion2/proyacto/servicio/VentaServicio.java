/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyacto.servicio;

import ec.edu.itq.programacion2.proyacto.dao.VentaDao;
import ec.edu.itq.programacion2.proyacto.modelo.Venta;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author RICHARD
 */
@Stateless
@LocalBean
public class VentaServicio {

      @EJB
    private VentaDao ventaDao;
    
    public void guardar(Venta venta){
        VentaDao.crate(ventaDao);
    }
}
