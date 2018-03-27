/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TheChaarly
 */
@Entity
@Table(name = "estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estado.FindAll", query = "SELECT es FROM Estado es" ),
    @NamedQuery(name = "Estado.FindByidEstado", query = "SELECT es FROM Estado es WHERE es.idEstado = :idEstado" ),
    @NamedQuery(name = "Estado.FindBynom_estado", query = "SELECT es FROM Estado es WHERE es.nom_estado = :nom_estado" )
})
public class Estado implements Serializable{
        private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado")
    private Integer idEstado;
    @Column(name = "estado")
    private String nom_estado;
    
    public Estado(){}

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getNom_estado() {
        return nom_estado;
    }

    public void setNom_estado(String nom_estado) {
        this.nom_estado = nom_estado;
    }

   
    public int hashCode(){
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }
    
    public boolean equals ( Object object){
        if( !(object instanceof Usuario)){
            return false;
       }
        Estado other = (Estado) object;
        if((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))){
            return false;
        }
        return true;
    }
    
    public String toString(){
        return "video.model.Estado[ idEstado=" + idEstado +"]";
    }
    
}
