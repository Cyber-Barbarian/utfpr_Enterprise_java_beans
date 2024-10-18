/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import bri.SomaEjb;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rafar
 */
@Named(value = "jsfSoma")
@RequestScoped
public class JsfSoma {

    @EJB
    private SomaEjb ejbSoma;

    /**
     * Creates a new instance of JsfSoma
     */
    public JsfSoma() {
    }
    @Getter @Setter
    private int valorA;
    @Getter @Setter
    private int valorB;
    @Getter
    private int resultado;
    
    public void somaNumeros(){
    resultado = ejbSoma.somaNumeros(valorA, valorB);
    }
    
    
}
