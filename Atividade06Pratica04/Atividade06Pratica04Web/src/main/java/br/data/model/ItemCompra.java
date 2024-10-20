/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.data.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rafar
 */
@Data
public class ItemCompra {
    
    @Getter @Setter
    private Produto produto;
    @Getter @Setter
    private int quantidade;

    public ItemCompra() {
    }

    public ItemCompra(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    
    
}
