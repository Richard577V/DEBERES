/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.dao;

import ec.edu.itq.programacion2.heladeria.generico.GenericoDao;
import ec.edu.itq.programacion2.heladeria.modelo.GestionBodega;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RICHARD
 */
@Stateless
public class GestionBodegaDao extends GenericoDao<GestionBodega> {
    @PersistenceContext(unitName = "Heladeria-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GestionBodegaDao() {
        super(GestionBodega.class);
    }
    
}
