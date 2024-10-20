/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.ejb.EjbRandomNumber;
import br.ejb.EjbUserRanking;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rafar
 */

@Named(value = "jsfJogo")
@SessionScoped
public class JsfJogo implements Serializable {

    @EJB
    private EjbRandomNumber randomNumberBean;
    
    @Getter @Setter
    private String nome;
    
    @Getter @Setter
    private int chute;
    
    @Getter
    private String mensagem;
    
    @Getter
    private int numero1;
    
    @Getter
    private int numero2;
    
    private List<EjbUserRanking> ranking = new ArrayList<>();
    private EjbUserRanking userBean;

    public void iniciarJogo() {
        userBean = getUserRankingByName(nome);
        if (userBean == null) {
            userBean = new EjbUserRanking();
            userBean.setNome(nome);
            ranking.add(userBean);
        }
        numero1 = randomNumberBean.getNumeroAleatorio();
        numero2 = randomNumberBean.getNumeroAleatorio();
        //mensagem = "";
    }

    public void verificarChute() {
        if (chute == (numero1 + numero2)) {
            mensagem = "Parabéns! Você acertou " + userBean.getNome() + "!!!";
            userBean.incrementarPontuacao();
        } else {
            mensagem = "Tente novamente!";
        }
        atualizarRanking();
        iniciarJogo();
    }

    private void atualizarRanking() {
        ranking.sort((u1, u2) -> Integer.compare(u2.getPontuacao(), u1.getPontuacao()));
    }

    private EjbUserRanking getUserRankingByName(String nome) {
        return ranking.stream().filter(u -> u.getNome().equals(nome)).findFirst().orElse(null);
    }

    public List<EjbUserRanking> getRanking() {
        return ranking;
    }
}
