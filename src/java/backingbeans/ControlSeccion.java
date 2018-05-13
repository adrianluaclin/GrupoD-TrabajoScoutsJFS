/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingbeans;

import entidadesJPA.Documentacion;
import entidadesJPA.Estado;
import entidadesJPA.Registro_seccion;
import entidadesJPA.Rol;
import entidadesJPA.Seccion;
import entidadesJPA.TipoSeccion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Named;;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ADRIAN LUACES
 */
@Named(value = "controlSeccion")
@RequestScoped
public class ControlSeccion {

    private TipoSeccion seccion;
    private List<Seccion> secciones;
    /**
     * Creates a new instance of Login
     */
    public ControlSeccion() {
        
        
        secciones = new ArrayList<Seccion>();
        secciones.add(new Seccion(TipoSeccion.castores));
    }

    public TipoSeccion getSeccion() {
        return seccion;
    }

    

    public void setSeccion(TipoSeccion seccion) {
        this.seccion = seccion;
    }

    

    public boolean comprobar() {
        // Implementar este método
        
        boolean result=false;
        
        Iterator <Seccion> it = secciones.iterator();
        
        boolean encontrado =false;
        
        while(it.hasNext() && !encontrado)
        {
            Seccion sec = it.next();
            
            if ( sec.getTipoSec().equals(seccion))
            {
                result=true;
            }
        }
        return result;
    }
    
    
}
