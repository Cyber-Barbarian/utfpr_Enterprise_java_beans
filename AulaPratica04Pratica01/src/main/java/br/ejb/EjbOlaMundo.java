/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package br.ejb;

import jakarta.ejb.Stateless;
import jakarta.ejb.LocalBean;

/**
 *
 * @author rafar
 */
@Stateless
@LocalBean
public class EjbOlaMundo {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    //passo 1 criamos o metodo de retorno
    public String getOi(){
    return "Olá Mundo EJB";
            }
    
}
