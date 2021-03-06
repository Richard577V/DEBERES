/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyacto.dao;

import ec.edu.itq.programacion2.proyacto.generico.GenericoDao;
import ec.edu.itq.programacion2.proyacto.modelo.Cliente;
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
public class ClienteDao extends GenericoDao<Cliente> {
    
    public ClienteDao() {
        super(Cliente.class);
    }
    public List<Cliente>buscarCliente(){
      Query query = getEntityManager().createQuery("SELECT c FROM Cliente c");
        
      List<Cliente> listaCliente = query.getResultList();
      
      return listaCliente;
    }
}
