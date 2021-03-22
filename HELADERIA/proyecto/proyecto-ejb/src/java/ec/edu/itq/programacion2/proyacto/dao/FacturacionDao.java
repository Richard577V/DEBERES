/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyacto.dao;

import ec.edu.itq.programacion2.proyacto.generico.GenericoDao;
import ec.edu.itq.programacion2.proyacto.modelo.Facturacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author RICHARD
 */
@Stateless
public class FacturacionDao extends GenericoDao<Facturacion> {
    @PersistenceContext(unitName = "proyecto-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacturacionDao() {
        super(Facturacion.class);
    }
    
}
