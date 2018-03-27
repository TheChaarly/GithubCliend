/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.dao.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import video.dao.UsuarioDAO;
import video.dto.UsuarioDTO;
import video.model.Usuario;
import video.util.HibernateUtil;

/**
 *
 * @author TheChaarly
 */
public class UsuarioDAOImp implements UsuarioDAO{

    public List<UsuarioDTO> getAllDtUsu() {
        System.out.println("Ingresa en getAllUsu UsuarioDAOImp");
        List<UsuarioDTO> list = null;
        String query = "";
        Connection conexion;
        ResultSet rs;
        Session session = HibernateUtil.getSessionFactory().openSession();
        conexion = session.connection();
        try {
            query = "SELECT * FROM USUARIO";
            System.out.println("query " + query.toString());
            Statement s = conexion.createStatement();
            rs = s.executeQuery(query);
            UsuarioDTO usuarioDTO = null;
            list = new ArrayList();
            while (rs.next()) {
                System.out.println("rs " + rs.getString(1));
                usuarioDTO = new UsuarioDTO();
                usuarioDTO.setId(rs.getInt(1));
                usuarioDTO.setNom(rs.getString(2));
                usuarioDTO.setApp(rs.getString(3));
                usuarioDTO.setApm(rs.getString(4));
                usuarioDTO.setTip(rs.getInt(5));
                usuarioDTO.setPass(rs.getString(6));
                usuarioDTO.setEstus(rs.getString(7));
                list.add(usuarioDTO);
            }
            
        } catch (Exception e) {
            System.out.println("Error en UsuarioDAOImpl " + e);
        }finally{
            session.close();
        }
        return list;
    }

    public List<UsuarioDTO> logueo(String Username, String Contrase) {
        System.out.println("Ingresa en getAllUsu UsuarioDAOImp");
        List<UsuarioDTO> list = null;
        String query = "";
        Connection conexion;
        ResultSet rs;
        Session session = HibernateUtil.getSessionFactory().openSession();
        conexion = session.connection();
        try {
            query = "SELECT * FROM USUARIO WHERE alias='"+ Username +"' AND Password='"+ Contrase +"'";
            System.out.println("query " + query.toString());
            Statement s = conexion.createStatement();
            rs = s.executeQuery(query);
            UsuarioDTO usuarioDTO = null;
            list = new ArrayList();
            while (rs.next()) {
                System.out.println("rs " + rs.getString(1));
                usuarioDTO = new UsuarioDTO();
                usuarioDTO.setId(rs.getInt(1));
                usuarioDTO.setNom(rs.getString(2));
                usuarioDTO.setApp(rs.getString(3));
                usuarioDTO.setApm(rs.getString(4));
                usuarioDTO.setTip(rs.getInt(5));
                usuarioDTO.setPass(rs.getString(6));
                usuarioDTO.setEstus(rs.getString(7));
                list.add(usuarioDTO);
            }
            
        } catch (Exception e) {
            System.out.println("Error en UsuarioDAOImpl " + e);
        }finally{
            session.close();
        }
        return list;
    }

    
}
