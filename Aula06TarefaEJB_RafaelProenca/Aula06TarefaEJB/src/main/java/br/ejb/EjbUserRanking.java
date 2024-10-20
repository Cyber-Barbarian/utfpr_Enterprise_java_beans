/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package br.ejb;

import java.util.ArrayList;
import javax.ejb.Stateful;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rafar
 */
@Stateful
public class EjbUserRanking {
    @Getter @Setter
    private String nome;
    
    @Getter @Setter
    private int pontuacao;

    public void incrementarPontuacao() {
        this.pontuacao++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EjbUserRanking that = (EjbUserRanking) o;
        return nome != null ? nome.equals(that.nome) : that.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }
}