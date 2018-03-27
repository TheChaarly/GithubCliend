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
import video.dao.EstadoDAO;
import video.dto.EstadoDTO;
import video.util.HibernateUtil;

/**
 *
 * @author TheChaarly
 */
public class EstadoDAOImp implements EstadoDAO{

    @Override
    public List<EstadoDTO> getAllEstados() {
        System.out.println("Ingresa en getAllEstados");
        List<EstadoDTO> list = null;
        Connection conexion;
        ResultSet rs;
        Session session = HibernateUtil.getSessionFactory().openSession();
        conexion = session.connection();
        try {
            String query = "SELECT * FROM estado";
            Statement s = conexion.createStatement();
            rs = s.executeQuery(query);
            EstadoDTO estadoDTO = null;
            list = new ArrayList();
            while(rs.next()){
                estadoDTO = new EstadoDTO();                
                estadoDTO.setId(rs.getInt(1));
                estadoDTO.setEstado(rs.getString(2));
                list.add(estadoDTO);
            }
        } catch (Exception e) {
            System.out.println("Error en EstadoDAOImp " +  e);
        }finally{
            session.close();
        }
        
        return list;
    }

    
}
