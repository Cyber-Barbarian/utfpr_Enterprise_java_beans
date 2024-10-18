/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author rafar
 */
@Stateless
public class EjbSoma implements bri.SomaEjb{
    // trazendo os métodos da interface
    @Override
    public int somaNumeros(int a, int b) {
        return a+b;
    }

   
}
