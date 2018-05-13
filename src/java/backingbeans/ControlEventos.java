/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingbeans;

import entidadesJPA.Evento;
import entidadesJPA.TipoEvento;
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
@Named(value = "ControlEventos")
@RequestScoped

public class ControlEventos {

    private String nombre;
    private List<Evento> listEventos;
    private TipoEvento tipo;

    /**
     * Creates a new instance of Eventos
     */
    public ControlEventos() {
        listEventos = new ArrayList<>();
        listEventos.add(new Evento("Reunión manada", TipoEvento.educacion));
        listEventos.add(new Evento("Campamento Clan Verano 2018", TipoEvento.campamentos));
        listEventos.add(new Evento("Excursión al río Verde", TipoEvento.excursiones));
        
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
    
    public String validarNombreEV() {
        boolean found = false;
        String res = null;
        Iterator<Evento> it = listEventos.iterator();
        while (it.hasNext() && !found) {
            Evento ev = it.next();
            if (ev.getNombreEvento().equals((nombre))) {

                found = true;
                res = ev.getNombreEvento();
            }

        }
        if (!found) {
            FacesContext ctx = FacesContext.getCurrentInstance();
            ctx.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Evento no encontrado", "Evento no encontrado"));
        }
        return res;
    }
    
        public String validarTipoEV() {
        String res = null;
        Iterator<Evento> it = listEventos.iterator();
        while (it.hasNext()) {
            Evento ev = it.next();
            if (ev.getTipoEvento().equals((tipo))) {
                res = ev.getTipoEvento().toString();
            }
        }
        return res;
    }
}


