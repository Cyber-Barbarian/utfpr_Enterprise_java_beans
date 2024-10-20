/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.ejb;

import java.util.Random;
import javax.ejb.Stateless;


/**
 *
 * @author rafar
 */
@Stateless
public class EjbRandomNumber {
    
    
   private Random random = new Random();

    public int getNumeroAleatorio() {
        return random.nextInt(100); // Gera número entre 0 e 99
    }
}

