/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.data.model;

import lombok.Data;
import lombok.Getter;

/**
 *
 * @author rafar
 */
//tag do lombok 1.18.22 (pom.xml) -> evita que precise digitar get e set ...
// a classe produto será nosa unidade de persistência
@Data
public class Produto {
    @Getter
    private int codigo;
    private String descricao;

    public Produto() {
    }

    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    
}
