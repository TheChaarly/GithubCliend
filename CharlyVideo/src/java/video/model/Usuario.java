/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.model;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.FindAll", query = "SELECT u FROM Usuario u" ),
    @NamedQuery(name = "Usuario.FindByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario" ),
    @NamedQuery(name = "Usuario.FindBynom_usu", query = "SELECT u FROM Usuario u WHERE u.nom_usu = :nom_usu" ),
    @NamedQuery(name = "Usuario.FindByappaterno_usu", query = "SELECT u FROM Usuario u WHERE u.appaterno_usu = :appaterno_usu" ),
    @NamedQuery(name = "Usuario.FindByapmaterno_usu", query = "SELECT u FROM Usuario u WHERE u.apmaterno_usu = :apmaterno_usu" ),
    @NamedQuery(name = "Usuario.FindBytipo_usu", query = "SELECT u FROM Usuario u WHERE u.tipo_usu = :tipo_usu" ),
    @NamedQuery(name = "Usuario.FindBypass", query = "SELECT u FROM Usuario u WHERE u.pass = :pass" ),
    @NamedQuery(name = "Usuario.FindByEstatus_usu", query = "SELECT u FROM Usuario u WHERE u.Estatus_usu = :Estatus_usu" ),    
    @NamedQuery(name = "Usuario.FindByfoto_usu", query = "SELECT u FROM Usuario u WHERE u.foto_usu = :foto_usu" ),
    @NamedQuery(name = "Usuario.FindByalias_usu", query = "SELECT u FROM Usuario u WHERE u.alias_usu = :alias_usu" ),
    @NamedQuery(name = "Usuario.FindBycalle_usu", query = "SELECT u FROM Usuario u WHERE u.calle_usu = :calle_usu" ),
    @NamedQuery(name = "Usuario.FindBycolonia_usu", query = "SELECT u FROM Usuario u WHERE u.colonia_usu = :colonia_usu" ),
    @NamedQuery(name = "Usuario.FindBytelefono_usu", query = "SELECT u FROM Usuario u WHERE u.telefono_usu = :telefono_usu" ),
    @NamedQuery(name = "Usuario.FindByfecha_nac_usu", query = "SELECT u FROM Usuario u WHERE u.fecha_nac_usu = :fecha_nac_usu" ),
    @NamedQuery(name = "Usuario.FindByfecha_usu", query = "SELECT u FROM Usuario u WHERE u.fecha_usu = :fecha_usu" ),
    @NamedQuery(name = "Usuario.FindByestado_usu", query = "SELECT u FROM Usuario u WHERE u.estado_usu = :estado_usu" )
})
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "nombre")
    private String nom_usu;
    @Column(name = "paterno")
    private String appaterno_usu;
    @Column(name = "materno")
    private String apmaterno_usu;
    @Column(name = "Tipo_usuario")
    private Integer tipo_usu;
    @Column(name = "Password")
    private String pass;
    @Column(name = "Estatus")
    private Integer Estatus_usu;    
    @Column(name = "foto")
    private byte[] foto_usu;
    @Column(name = "alias")
    private String alias_usu;
    @Column(name = "calle")
    private String calle_usu;
    @Column(name = "colonia")
    private String colonia_usu;
    @Column(name = "telefono")
    private String telefono_usu;
    @Column(name = "fecha_nac")
    private Date fecha_nac_usu;
    @Column(name = "fecha")
    private Date fecha_usu;
    @Column(name = "estado")
    private Integer estado_usu;
    
    public Usuario(){
        
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getAppaterno_usu() {
        return appaterno_usu;
    }

    public void setAppaterno_usu(String appaterno_usu) {
        this.appaterno_usu = appaterno_usu;
    }

    public String getApmaterno_usu() {
        return apmaterno_usu;
    }

    public void setApmaterno_usu(String apmaterno_usu) {
        this.apmaterno_usu = apmaterno_usu;
    }

    public Integer getTipo_usu() {
        return tipo_usu;
    }

    public void setTipo_usu(Integer tipo_usu) {
        this.tipo_usu = tipo_usu;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

        
    public String getAlias_usu() {
        return alias_usu;
    }

    public void setAlias_usu(String alias_usu) {
        this.alias_usu = alias_usu;
    }

    public String getCalle_usu() {
        return calle_usu;
    }

    public void setCalle_usu(String calle_usu) {
        this.calle_usu = calle_usu;
    }

    public String getColonia_usu() {
        return colonia_usu;
    }

    public void setColonia_usu(String colonia_usu) {
        this.colonia_usu = colonia_usu;
    }

    public String getTelefono_usu() {
        return telefono_usu;
    }

    public void setTelefono_usu(String telefono_usu) {
        this.telefono_usu = telefono_usu;
    }

    public Date getFecha_nac_usu() {
        return fecha_nac_usu;
    }

    public void setFecha_nac_usu(Date fecha_nac_usu) {
        this.fecha_nac_usu = fecha_nac_usu;
    }

    public Date getFecha_usu() {
        return fecha_usu;
    }

    public void setFecha_usu(Date fecha_usu) {
        this.fecha_usu = fecha_usu;
    }

    public Integer getEstado_usu() {
        return estado_usu;
    }

    public void setEstado_usu(Integer estado_usu) {
        this.estado_usu = estado_usu;
    }

    public byte[] getFoto_usu() {
        return foto_usu;
    }

    public void setFoto_usu(byte[] foto_usu) {
        this.foto_usu = foto_usu;
    }

    public Integer getEstatus_usu() {
        return Estatus_usu;
    }

    public void setEstatus_usu(Integer Estatus_usu) {
        this.Estatus_usu = Estatus_usu;
    }
    
    public int hashCode(){
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }
    
    public boolean equals ( Object object){
        if( !(object instanceof Usuario)){
            return false;
       }
        Usuario other = (Usuario) object;
        if((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))){
            return false;
        }
        return true;
    }
    
    public String toString(){
        return "video.model.Usuario[ idUsuario=" +idUsuario+"]";
    }

}
