/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB40/StatelessEjbClass.java to edit this template
 */
package br.ejb;

import jakarta.ejb.Stateless;

/**
 *
 * @author rafael.proenca
 */
@Stateless
public class EjbLocal implements EjbLocalLocal {

    @Override
    public int dobra(int valor) {
        return 2*valor;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
