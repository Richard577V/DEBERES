package ec.edu.itq.programacion2.proyacto.modelo;

import ec.edu.itq.programacion2.proyacto.modelo.Cliente;
import ec.edu.itq.programacion2.proyacto.modelo.Facturacion;
import ec.edu.itq.programacion2.proyacto.modelo.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T17:12:00")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Boolean> estado;
    public static volatile SingularAttribute<Venta, Integer> precio;
    public static volatile SingularAttribute<Venta, Cliente> idCliente;
    public static volatile SingularAttribute<Venta, Short> cantidadVentas;
    public static volatile SingularAttribute<Venta, Producto> idProducto;
    public static volatile ListAttribute<Venta, Facturacion> facturacionList;
    public static volatile SingularAttribute<Venta, Date> fechaVentas;
    public static volatile SingularAttribute<Venta, Integer> idVenta;

}