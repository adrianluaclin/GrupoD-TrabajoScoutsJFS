package backingbeans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidadesJPA.Documentacion;
import entidadesJPA.Estado;
import entidadesJPA.Rol;
import entidadesJPA.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


/**
 *
 * @author ADRIAN LUACES
 */
@Named(value = "controlDocumentacion")
@RequestScoped
public class ControlDocumentacion {

    private String usuario;
    private List<Usuario> usuarios;
    private Documentacion doc;

   
   

    /**
     * Creates a new instance of Login
     */
    public ControlDocumentacion() {
        
        Date fecha = new Date(18,3,5);
        
        usuarios = new ArrayList<Usuario>();
        
        usuarios.add(new Usuario("pepe", "abc", Rol.educando));
        
        doc=new Documentacion("Seguridad Social","Documento1",fecha,Estado.todo_correcto);
    }

    public String getUsuario() {
        return usuario;
    }

    

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Documentacion getDoc() {
        return doc;
    }

    public void setDoc(Documentacion doc) {
        this.doc = doc;
    }

    public boolean comprobar() {
        // Implementar este método
        
        boolean result=false;
        
        Iterator <Usuario> it = usuarios.iterator();
        
        boolean encontrado =false;
        
        while(it.hasNext() && !encontrado)
        {
            Usuario us = it.next();
            
            if ( us.getAliasUs().equals(usuario))
            {
                result=true;
            }
        }
        return result;
    }
    
}
