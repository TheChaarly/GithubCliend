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
@Table(name = "generoanime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GnAnime.FindAll", query = "SELECT ga FROM GnAnime ga"),
    @NamedQuery(name = "GnAnime.FindByidGeneroA", query = "SELECT ga FROM GnAnime ga WHERE ga.idGeneroA = :idGeneroA"),
    @NamedQuery(name = "GnAnime.FindByGeneroA", query = "SELECT ga FROM GnAnime ga WHERE ga.GeneroA = :GeneroA"),
    @NamedQuery(name = "GnAnime.FindBydescripcionA", query = "SELECT ga FROM GnAnime ga WHERE ga.descripcionA = :descripcionA")
})
public class GnAnime implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_generoA")
    private Integer idGeneroA;
    @Column(name = "nombre")
    private String GeneroA;
    @Column(name = "descripcion")
    private String descripcionA;

    public Integer getIdGeneroA() {
        return idGeneroA;
    }

    public void setIdGeneroA(Integer idGeneroA) {
        this.idGeneroA = idGeneroA;
    }

    public String getGeneroA() {
        return GeneroA;
    }

    public void setGeneroA(String GeneroA) {
        this.GeneroA = GeneroA;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }
    
    public int hashCode(){
        int hash = 0;
        hash += (idGeneroA != null ? idGeneroA.hashCode() : 0);
        return hash;
    }
    
    public boolean equals ( Object object){
        if( !(object instanceof GnAnime)){
            return false;
       }
        GnAnime other = (GnAnime) object;
        if((this.idGeneroA == null && other.idGeneroA != null) || (this.idGeneroA != null && !this.idGeneroA.equals(other.idGeneroA))){
            return false;
        }
        return true;
    }
    
    public String toString(){
        return "video.model.GnAnime[ idGeneroA=" + idGeneroA +"]";
    }
    
}
