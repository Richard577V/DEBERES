/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyacto.dao;

import ec.edu.itq.programacion2.proyacto.generico.GenericoDao;
import ec.edu.itq.programacion2.proyacto.modelo.GestionBodega;
import static java.util.Collections.list;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author RICHARD
 */
@Stateless
public class GestionBodegaDao extends GenericoDao<GestionBodega> {
    
    public GestionBodegaDao() {
        super(GestionBodega.class);
    }
      
    public  List<GestionBodega>buscarGestionBodega(){
        Query query = getEntityManager().createQuery("SELECT th FROM GestionBodega th WHERE th.estado=true");
        List<GestionBodega> listaGestionBodega = query.getResultList();
     
      return listaGestionBodega;
    }
    
}
