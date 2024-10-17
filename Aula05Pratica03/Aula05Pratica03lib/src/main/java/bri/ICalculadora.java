/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bri;

import javax.ejb.Remote;

/**
 *
 * @author rafael.proenca
 */
//pronto o projeto.
//quando compilarmos esse projeto será gerado um jar somente com essa interface
//ela será usada tanto para o servidor ejb quanto para o cliente ejb
@Remote
public interface ICalculadora {
    
    public int somar(int a, int b);
    
}
