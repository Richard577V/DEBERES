/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyacto.servicio;

import ec.edu.itq.programacion2.proyacto.dao.GestionBodegaDao;
import ec.edu.itq.programacion2.proyacto.modelo.GestionBodega;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author RICHARD
 */
@Stateless
@LocalBean
public class GestionBodegaServicio {

      @EJB
  private GestionBodegaDao gestionBodegaDao;
  
  public void guardar(GestionBodega gestionBodega){
      gestionBodegaDao .create(gestionBodega);
  }
  public List<GestionBodega>buscarGestionBodega(){
      
      List<GestionBodega> listaGestionBodega = gestionBodegaDao.buscarGestionBodega();
     
      return listaGestionBodega;
  }
}
