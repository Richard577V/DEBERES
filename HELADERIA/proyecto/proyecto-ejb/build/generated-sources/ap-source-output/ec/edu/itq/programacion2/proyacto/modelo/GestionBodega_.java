package ec.edu.itq.programacion2.proyacto.modelo;

import ec.edu.itq.programacion2.proyacto.modelo.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T17:11:59")
@StaticMetamodel(GestionBodega.class)
public class GestionBodega_ { 

    public static volatile SingularAttribute<GestionBodega, String> descripcion;
    public static volatile SingularAttribute<GestionBodega, Boolean> estado;
    public static volatile ListAttribute<GestionBodega, Producto> productoList;
    public static volatile SingularAttribute<GestionBodega, Integer> idGestionBodega;
    public static volatile SingularAttribute<GestionBodega, Short> cantidad;
    public static volatile SingularAttribute<GestionBodega, String> nombre;

}