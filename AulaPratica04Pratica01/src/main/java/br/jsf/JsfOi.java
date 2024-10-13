/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.ejb.EjbOlaMundo;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;

/**
 *
 * @author rafar
 */
@Named(value = "jsfOi")
@RequestScoped
public class JsfOi {
    
    //criamos a chamada do ejb com botão direito + insert code + call enterprise bean
    //no nosso caso precisamos primeiro fazer os imports dos packages
    @EJB
    private EjbOlaMundo ejbOlaMundo;
    
    
    

    /**
     * Creates a new instance of JsfOi
     */
    public JsfOi() {
    }
    //criamos o método e em seguida vamos modificar o index.html
    public String getOi(){
        return ejbOlaMundo.getOi();
    }
    
}
