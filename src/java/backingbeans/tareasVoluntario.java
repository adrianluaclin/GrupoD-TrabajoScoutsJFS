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
@Named(value = "tareasVoluntario")
@Dependent
public class tareasVoluntario {

    /**
     * Creates a new instance of tareasVoluntario
     */
    public tareasVoluntario() {
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
