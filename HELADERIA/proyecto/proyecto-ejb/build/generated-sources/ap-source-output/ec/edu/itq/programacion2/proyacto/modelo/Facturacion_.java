package ec.edu.itq.programacion2.proyacto.modelo;

import ec.edu.itq.programacion2.proyacto.modelo.Cliente;
import ec.edu.itq.programacion2.proyacto.modelo.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T17:12:00")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, Integer> precio;
    public static volatile SingularAttribute<Facturacion, Integer> total;
    public static volatile SingularAttribute<Facturacion, Integer> servicio;
    public static volatile SingularAttribute<Facturacion, Cliente> idCliente;
    public static volatile SingularAttribute<Facturacion, Integer> iva;
    public static volatile SingularAttribute<Facturacion, Integer> subtotal;
    public static volatile SingularAttribute<Facturacion, Integer> idFacturacion;
    public static volatile SingularAttribute<Facturacion, Venta> idVenta;

}