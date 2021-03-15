/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.heladeria.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author RICHARD
 */
@Entity
@Table(name = "gestion_bodega")
@NamedQueries({
    @NamedQuery(name = "GestionBodega.findAll", query = "SELECT g FROM GestionBodega g")})
public class GestionBodega implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_gestion_bodega")
    private Integer idGestionBodega;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Boolean estado;
    @OneToMany(mappedBy = "idGestionBodega", fetch = FetchType.LAZY)
    private List<Producto> productoList;

    public GestionBodega() {
    }

    public GestionBodega(Integer idGestionBodega) {
        this.idGestionBodega = idGestionBodega;
    }

    public GestionBodega(Integer idGestionBodega, String nombre) {
        this.idGestionBodega = idGestionBodega;
        this.nombre = nombre;
    }

    public Integer getIdGestionBodega() {
        return idGestionBodega;
    }

    public void setIdGestionBodega(Integer idGestionBodega) {
        this.idGestionBodega = idGestionBodega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGestionBodega != null ? idGestionBodega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GestionBodega)) {
            return false;
        }
        GestionBodega other = (GestionBodega) object;
        if ((this.idGestionBodega == null && other.idGestionBodega != null) || (this.idGestionBodega != null && !this.idGestionBodega.equals(other.idGestionBodega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.heladeria.modelo.GestionBodega[ idGestionBodega=" + idGestionBodega + " ]";
    }
    
}
