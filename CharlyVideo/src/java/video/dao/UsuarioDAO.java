/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video.dao;

import java.util.List;
import video.dto.UsuarioDTO;
import video.model.Usuario;

/**
 *
 * @author TheChaarly
 */
public interface UsuarioDAO {
    
    List<UsuarioDTO> getAllDtUsu();
    
    
}
