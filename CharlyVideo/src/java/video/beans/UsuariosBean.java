/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.UploadedFile;
import video.dao.imp.UsuarioDAOImp;
import video.dto.UsuarioDTO;
import video.model.Usuario;
import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import video.util.HibernateUtil;


/**
 *
 * @author TheChaarly
 */
@ManagedBean (name = "usuariosBean")
@SessionScoped
public class UsuariosBean {
    private Usuario usuario;
    private List<UsuarioDTO> listUsu;
    private UsuarioDAOImp usuarioDAOImp;
    private UploadedFile filefoto;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private String alias;
    private String calle;
    private String contra;
    private String colonia;
    private String telefono;
    private Date fecha_nac;
    private Integer tipousu;
    private Integer estatus;
    private Integer estado;
    private Date fecha;
    
    public UsuariosBean(){
        getAllUsuarios();
        usuario = new Usuario();
    }
    
    public void getAllUsuarios(){
        System.out.println("Ingresa en getallusuarios");
        usuarioDAOImp = new UsuarioDAOImp();
        listUsu = usuarioDAOImp.getAllDtUsu();
    }
    
    public void valDeUplodfile(){
        
    }
    
    public void guardaRegUsuario(){
        Session session = null;
        try {
            Calendar c2 = new GregorianCalendar();
            session = HibernateUtil.getSessionFactory().openSession();
            
            byte[] img = IOUtils.toByteArray(filefoto.getInputstream());
            System.out.println("Ingresa" + img.length);
            System.out.println("\n \n ____________________________ ");
            System.out.println("nombre " +nombre);
            System.out.println("apellidopaterno " +appaterno);
            System.out.println("apellidomaterno " + apmaterno);
            System.out.println("alias " + alias);
            System.out.println("pass " + contra);
            System.out.println("calle " + calle);
            System.out.println("colonioa " + colonia);
            System.out.println("estado " + estado);
            System.out.println("fecha " + fecha_nac);
            System.out.println("foto " + img.length);
            System.out.println("telefono  " + telefono);
            System.out.println("estatus  " + estatus);
            System.out.println("tipo usuario  " + tipousu);
            System.out.println("Fecha  " + c2.getTime());
            System.out.println("\n \n_____________________");
            usuario.setNom_usu(nombre);
            usuario.setAppaterno_usu(appaterno);
            usuario.setApmaterno_usu(apmaterno);
            usuario.setAlias_usu(alias);
            usuario.setPass(contra);
            usuario.setCalle_usu(calle);
            usuario.setColonia_usu(colonia);
            usuario.setEstado_usu(estado);
            usuario.setEstatus_usu(estatus);
            usuario.setFecha_usu(c2.getTime());
            usuario.setFecha_nac_usu(fecha_nac);
            usuario.setFoto_usu(img);
            usuario.setTelefono_usu(telefono);
            usuario.setTipo_usu(tipousu);
            
            session.save(usuario);
            session.flush();
            session.clear();

        } catch (IOException ex) {
            Logger.getLogger(UsuariosBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public UsuarioDAOImp getUsuarioDAOImp() {
        return usuarioDAOImp;
    }

    public void setUsuarioDAOImp(UsuarioDAOImp usuarioDAOImp) {
        this.usuarioDAOImp = usuarioDAOImp;
    }

    public List<UsuarioDTO> getListUsu() {
        return listUsu;
    }

    public void setListUsu(List<UsuarioDTO> listUsu) {
        this.listUsu = listUsu;
    }

    public UploadedFile getFilefoto() {
        return filefoto;
    }

    public void setFilefoto(UploadedFile filefoto) {
        this.filefoto = filefoto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public Integer getTipousu() {
        return tipousu;
    }

    public void setTipousu(Integer tipousu) {
        this.tipousu = tipousu;
    }

    public Integer getEstatus() {
        return estatus;
    }

    public void setEstatus(Integer estatus) {
        this.estatus = estatus;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
