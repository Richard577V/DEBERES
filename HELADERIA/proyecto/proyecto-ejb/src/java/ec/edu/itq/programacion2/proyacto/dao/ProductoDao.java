/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyacto.dao;

import ec.edu.itq.programacion2.proyacto.generico.GenericoDao;
import ec.edu.itq.programacion2.proyacto.modelo.Producto;
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
public class ProductoDao extends GenericoDao<Producto> {

    public static void create(ProductoDao productoDao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public ProductoDao() {
        super(Producto.class);
    }
    
     public List<Producto>buscarProducto(){
    Query query = getEntityManager().createQuery("SELECT p FROM Producto p");
      List<Producto> listaProducto = query.getResultList();
      
      return listaProducto;
  }
    
}
