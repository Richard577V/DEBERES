
package hotel;


/**
 *
 * @author RICHARD
 */
public class HORARIOS {
       
        private Integer hora;
	private date fecha_de_ingreso;
	private date fecha_de_salida;
	private Boolean estado;

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public date getFecha_de_ingreso() {
        return fecha_de_ingreso;
    }

    public void setFecha_de_ingreso(date fecha_de_ingreso) {
        this.fecha_de_ingreso = fecha_de_ingreso;
    }

    public date getFecha_de_salida() {
        return fecha_de_salida;
    }

    public void setFecha_de_salida(date fecha_de_salida) {
        this.fecha_de_salida = fecha_de_salida;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    
}
