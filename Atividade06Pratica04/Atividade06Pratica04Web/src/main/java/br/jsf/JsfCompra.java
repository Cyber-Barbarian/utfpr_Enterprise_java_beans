/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.data.crud.EjbCompra;
import br.data.model.ItemCompra;
import br.data.model.Produto;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;

/**
 *
 * @author rafar
 */
@Named(value = "jsfCompra")
@SessionScoped
public class JsfCompra implements Serializable {

    @EJB
    private EjbCompra ejbCompra;

    /**
     * Creates a new instance of JsfCompra
     */
    public JsfCompra() {
    }
    
    public void add(Produto produto){
        ejbCompra.add(produto);
    }
    
    public ArrayList<ItemCompra> getAll(){
     return ejbCompra.getAll();
    }
    
    public void limparLista(){
        ejbCompra.limparLista();
    }
}
