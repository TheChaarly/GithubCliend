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
@Table(name = "generoseries")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Generoseries.FindAll", query = "SELECT * FROM Generoseries gs"),
    @NamedQuery(name = "Generoseries.FindByidGeneroA", query = "SELECT * FROM Generoseries gs WHERE gs.idSerie = :idSerie"),
    @NamedQuery(name = "Generoseries.FindByGeneroA", query = "SELECT * FROM Generoseries gs WHERE gs.SerieS = :SerieS"),
    @NamedQuery(name = "Generoseries.FindBydescripcionA", query = "SELECT * FROM Generoseries gs WHERE gs.DescripcionS = :DescripcionS")
})
public class GnSeries implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_generoS")
    private Integer idSerie;
    @Column(name = "nombre")
    private String SerieS;
    @Column(name = "descripcion")
    private String DescripcionS;

    public Integer getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Integer idSerie) {
        this.idSerie = idSerie;
    }

    public String getSerieS() {
        return SerieS;
    }

    public void setSerieS(String SerieS) {
        this.SerieS = SerieS;
    }

    public String getDescripcionS() {
        return DescripcionS;
    }

    public void setDescripcionS(String DescripcionS) {
        this.DescripcionS = DescripcionS;
    }
    
    public int hashCode(){
        int hash = 0;
        hash += (idSerie != null ? idSerie.hashCode() : 0);
        return hash;
    }
    
    public boolean equals ( Object object){
        if( !(object instanceof GnSeries)){
            return false;
       }
        GnSeries other = (GnSeries) object;
        if((this.idSerie == null && other.idSerie != null) || (this.idSerie != null && !this.idSerie.equals(other.idSerie))){
            return false;
        }
        return true;
    }
    
    public String toString(){
        return "video.model.GnSeries[ idSerie=" + idSerie +"]";
    }
}
