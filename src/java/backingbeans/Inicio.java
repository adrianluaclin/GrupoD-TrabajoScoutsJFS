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
@Named(value = "inicio")
@Dependent
public class Inicio {

    /**
     * Creates a new instance of Inicio
     */
    public Inicio() {
    }

    /**
     *
     * @return
     */
    public String sobreNosotros() {
        return "sobrenosotros.xhtml";
    }

    public String eventos() {
        return "eventos.xhtml";
    }

    public String inscribirse() {
        return "inscribirse.xhtml";
    }

    public String noticias() {
        return "noticias.xhtml";
    }

    public String secciones() {
        return "secciones.xhtml";
    }

    public String manada() {
        return "manada.xhtml";
    }

    public String castores() {
        return "castores.xhtml";
    }

    public String clan() {
        return "clan.xhtml";
    }

    public String unidad() {
        return "unidad.xhtml";
    }

    public String tropa() {
        return "tropa.xhtml";
    }

    public String admin() {
        return "admin.xhtml";
    }

    public String voluntario() {
        return "voluntario.xhtml";
    }

    public String perfil() {
        return "miperfil.xhtml";
    }

    public String uniformes() {
        return "uniformes.xhtml";
    }

    public String mochila() {
        return "mochila.xhtml";
    }

    public String equipamiento() {
        return "equipamiento.xhtml";
    }

}
