package ec.edu.itq.programacion2.proyacto.modelo;

import ec.edu.itq.programacion2.proyacto.modelo.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-22T17:12:00")
@StaticMetamodel(Caracteristica.class)
public class Caracteristica_ { 

    public static volatile SingularAttribute<Caracteristica, String> descripcion;
    public static volatile ListAttribute<Caracteristica, Producto> productoList;
    public static volatile SingularAttribute<Caracteristica, Integer> idCaracteristica;
    public static volatile SingularAttribute<Caracteristica, Short> cantidad;
    public static volatile SingularAttribute<Caracteristica, String> nombre;

}