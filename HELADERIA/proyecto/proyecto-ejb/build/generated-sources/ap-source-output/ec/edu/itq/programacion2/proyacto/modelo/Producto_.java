package ec.edu.itq.programacion2.proyacto.modelo;

import ec.edu.itq.programacion2.proyacto.modelo.Caracteristica;
import ec.edu.itq.programacion2.proyacto.modelo.GestionBodega;
import ec.edu.itq.programacion2.proyacto.modelo.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T17:12:00")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, Boolean> estado;
    public static volatile ListAttribute<Producto, Venta> ventaList;
    public static volatile SingularAttribute<Producto, Short> categoria;
    public static volatile SingularAttribute<Producto, Caracteristica> idCaracteristica;
    public static volatile SingularAttribute<Producto, GestionBodega> idGestionBodega;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, String> nombre;

}