/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package br.data.crud;

import br.data.model.ItemCompra;
import br.data.model.Produto;
import java.util.ArrayList;
import javax.ejb.Stateful;

/**
 *
 * @author rafar
 */
@Stateful
public class EjbCompra {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private ArrayList<ItemCompra> lcompra;

    public EjbCompra() {
        lcompra = new ArrayList<>();
    }
    
    public void add(Produto produto){
        boolean achou = false;
        for (ItemCompra item : lcompra){
            if (item.getProduto().getCodigo() == produto.getCodigo()){
            item.setQuantidade(item.getQuantidade() + 1);
            achou = true;
            break;
            }
        }
        if (!achou){
            lcompra.add(new ItemCompra(produto,1));
        }
    }
    
    public ArrayList<ItemCompra> getAll(){
        return lcompra;
    }
    
    public void limparLista(){
        lcompra = new ArrayList<>();
    }
            
}
