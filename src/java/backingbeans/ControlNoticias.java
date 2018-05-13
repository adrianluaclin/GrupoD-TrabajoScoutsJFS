/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingbeans;

import entidadesJPA.Evento;
import entidadesJPA.Noticia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Vanesa
 */
@Named(value = "controlNoticias")
@RequestScoped
public class ControlNoticias {
    private String nombre;
    private List<Noticia> listNoticias;

    /**
     * Creates a new instance of ControlNoticias
     */
    public ControlNoticias() {
        List<Noticia> listNoticias = new ArrayList<>();
        listNoticias.add(new Noticia("Festival de Málaga"));
        listNoticias.add(new Noticia( "navidad 2018"));
        listNoticias.add(new Noticia("nueva fecha amapada manada"));     
    }
    
      public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String validarEvento() {
        boolean found = false;
        String res = null;
        Iterator<Noticia> it = listNoticias.iterator();
        while (it.hasNext() && !found) {
            Noticia not = it.next();
            if (not.getNombre().equals((nombre))) {

                found = true;
                res = not.getNombre();
            }

        }
        if (!found) {
            FacesContext ctx = FacesContext.getCurrentInstance();
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Noticia no encontrada", "Noticia no encontrada"));
        }
        return res;
    }
}
    