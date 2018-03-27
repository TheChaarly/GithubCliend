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
import video.dto.GnAnimeDTO;
import video.util.HibernateUtil;

/**
 *
 * @author TheChaarly
 */
public class GnAnimeDAOImp {

    public List<GnAnimeDTO> getListGnA() {
        System.out.println("GetListGnA");
        List<GnAnimeDTO> list = null;
        ResultSet rs;
        Connection connexion;
        Session session = HibernateUtil.getSessionFactory().openSession();
        connexion = session.connection();
        try {
            System.out.println("try");
            String query = "SELECT * FROM generoanime";
            Statement s = connexion.createStatement();
            rs = s.executeQuery(query);
            GnAnimeDTO gn = null;
            list = new ArrayList();
            while(rs.next()){
                System.out.println("While");
                gn = new GnAnimeDTO();
                gn.setId(rs.getInt(1));
                gn.setNombre(rs.getString(2));
                gn.setDescripcion(rs.getString(3));
                list.add(gn);
            }
        } catch (Exception e) {
            System.out.println("Error en getListGnA " + e );
            
        }finally {
            session.close();
        }
        return list;        
    }
    
}
