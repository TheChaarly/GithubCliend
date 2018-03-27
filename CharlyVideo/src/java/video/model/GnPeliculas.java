/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.model;

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
@Table(name = "generopeliculas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Generopeliculas.FindAll", query = "SELECT * FROM Generopeliculas gp"),
    @NamedQuery(name = "Generopeliculas.FindByidPeliculas", query = "SELECT * FROM Generopeliculas gp WHERE gp.idPeliculas = :idPeliculas"),
    @NamedQuery(name = "Generopeliculas.FindBynombreP", query = "SELECT * FROM Generopeliculas gp WHERE gp.nombreP = :nombreP"),
    @NamedQuery(name = "Generopeliculas.FindByDescripcionP", query = "SELECT * FROM Generopeliculas gp WHERE gp.DescripcionP = :DescripcionP")
})
public class GnPeliculas {
    
        private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_generoP")
    private Integer idPeliculas;
    @Column(name = "nombre")
    private String nombreP;
    @Column(name = "descripcion")
    private String DescripcionP;

    public Integer getIdPeliculas() {
        return idPeliculas;
    }

    public void setIdPeliculas(Integer idPeliculas) {
        this.idPeliculas = idPeliculas;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String DescripcionP) {
        this.DescripcionP = DescripcionP;
    }
    
    public int hashCode(){
        int hash = 0;
        hash += (idPeliculas != null ? idPeliculas.hashCode() : 0);
        return hash;
    }
    
    public boolean equals ( Object object){
        if( !(object instanceof GnPeliculas)){
            return false;
       }
        GnPeliculas other = (GnPeliculas) object;
        if((this.idPeliculas == null && other.idPeliculas != null) || (this.idPeliculas != null && !this.idPeliculas.equals(other.idPeliculas))){
            return false;
        }
        return true;
    }
    
    public String toString(){
        return "video.model.GnPeliculas[ idPelulas=" + idPeliculas +"]";
    }
    
}
