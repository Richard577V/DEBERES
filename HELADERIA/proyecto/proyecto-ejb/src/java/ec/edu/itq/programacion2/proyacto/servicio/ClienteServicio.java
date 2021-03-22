/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.proyacto.servicio;

import ec.edu.itq.programacion2.proyacto.dao.ClienteDao;
import ec.edu.itq.programacion2.proyacto.modelo.Cliente;
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
public class ClienteServicio {

  @EJB
  private ClienteDao clienteDao;
  
  public void guardar(Cliente cliente){
      clienteDao.create(cliente);
  }
  public List<Cliente>buscarCliente(){
      
      List<Cliente> listaCliente = clienteDao.buscarCliente();
      
      return listaCliente;
  }
}
