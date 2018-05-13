/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingbeans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author ADRIAN LUACES
 */
@Named(value = "tareasAdministrador")
@Dependent
public class tareasAdministrador {

    /**
     * Creates a new instance of tareasAdministrador
     */
    public tareasAdministrador() {
    }
    
    public String validarUsuarios() {
        
        return "validar-usuarios.xhtml";
    }
    
    public String listarImpagos()
    {
        return "listar-impagos.xhtml";
    }
    
    public String listarUsuarios()
    {
        return "listar-usuarios.xhtml";
    }
    
    public String verDocumentacion() {
        
        return "ver-documentacion.xhtml";
    }
    
    public String crearEventos() {
        
        return "creacion-eventos.xhtml";
    }
    
    public String crearNoticias() {
        
        return "creacion-noticias.xhtml";
    }
    
    public String modificarEventos() {
        
        return "modificar-eventos.xhtml";
    }
    
    public String modificarNoticias() {
        
        return "modificar-noticias.xhtml";
    }
    
    public String borrarEventos() {
        
        return "borrar-eventos.xhtml";
    }
    
    public String borrarNoticias() {
        
        return "borrar-noticias.xhtml";
    }
}
