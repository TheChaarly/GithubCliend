/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.beans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import video.dao.EstadoDAO;
import video.dao.imp.EstadoDAOImp;
import video.dto.EstadoDTO;



/**
 *
 * @author TheChaarly
 */
@ManagedBean(name = "estadoBean")
@SessionScoped
public class EstadoBean {
    private EstadoDAOImp estadoDAOImp;
    private EstadoDAO estadoDAO;
    private List<EstadoDTO> liststadto; 
    private List<SelectItem> listslecone; 
    private Integer valorlistestado;
    
    public EstadoBean(){
        System.out.println("Ingresa en estadoBEan");
        listEstados();
    }
    
    public void listEstados(){
        estadoDAOImp = new EstadoDAOImp();
        liststadto = estadoDAOImp.getAllEstados();
        if(liststadto.size() != 0){
                listslecone = new ArrayList<SelectItem>();
            for(EstadoDTO estado : liststadto ){
                System.out.println("estado" +  estado.getEstado());
                listslecone.add(new SelectItem(estado.getId(), estado.getEstado()));
            }
        }
    }
    

    public EstadoDAOImp getEstadoDAOImp() {
        return estadoDAOImp;
    }

    public void setEstadoDAOImp(EstadoDAOImp estadoDAOImp) {
        this.estadoDAOImp = estadoDAOImp;
    }

    public EstadoDAO getEstadoDAO() {
        return estadoDAO;
    }

    public void setEstadoDAO(EstadoDAO estadoDAO) {
        this.estadoDAO = estadoDAO;
    }

    public List<EstadoDTO> getListstadto() {
        return liststadto;
    }

    public void setListstadto(List<EstadoDTO> liststadto) {
        this.liststadto = liststadto;
    }   

    public List<SelectItem> getListslecone() {
        return listslecone;
    }

    public void setListslecone(List<SelectItem> listslecone) {
        this.listslecone = listslecone;
    }

    public Integer getValorlistestado() {
        return valorlistestado;
    }

    public void setValorlistestado(Integer valorlistestado) {
        this.valorlistestado = valorlistestado;
    }
    
}
