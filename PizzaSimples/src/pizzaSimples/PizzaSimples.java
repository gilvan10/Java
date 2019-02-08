/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaSimples;

import interfaces.IComponente;

/**
 *
 * @author Renata
 */
public class PizzaSimples implements IComponente {
    
    @Override
    public String adicionar() {
        return "Adicionando pizza simples" +"\n"+ this.preparar(); 
    }

    @Override
    public String preparar() {
        return "Preparando pizza simples";
    }
    
}
