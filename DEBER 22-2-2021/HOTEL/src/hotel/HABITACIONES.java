
package hotel;

/**
 *
 * @author RICHARD
 */
public class HABITACIONES {
    
        private String nombre;
	private String categoria;
	private date fecha_de_entrada;
        private date fecha_de_salida;
	private Boolean estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public date getFecha_de_entrada() {
        return fecha_de_entrada;
    }

    public void setFecha_de_entrada(date fecha_de_entrada) {
        this.fecha_de_entrada = fecha_de_entrada;
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
