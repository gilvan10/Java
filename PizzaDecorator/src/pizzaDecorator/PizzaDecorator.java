/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaDecorator;

import interfaces.IComponente;

/**
 *
 * @author Renata
 */
public class PizzaDecorator implements IComponente {
    private IComponente decorator;
    
    protected PizzaDecorator() {
     
    }

    public IComponente getDecorator() {
        return decorator;
    }

    public void setDecorator(IComponente decorator) {
        this.decorator = decorator;
    }

    @Override
    public String adicionar() {
       return this.decorator.adicionar(); 
    }

    @Override
    public String preparar() {
        return decorator.preparar();
    }
        
}
