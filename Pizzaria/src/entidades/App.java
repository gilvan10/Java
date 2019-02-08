/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaces.IComponente;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Scanner;

/**
 *
 * @author Renata
 */
public class App {
    
    //public static void main(String[] args){
        
//        PizzaDecorator calabresa = new DecoratorCalabresa();
//        PizzaDecorator catupiry = new DecoratorCatupiry();
//        PizzaDecorator frango = new DecoratorFrango();
//        PizzaDecorator tomate = new DecoratorTomate();
//        IComponente pizzaSimples = new PizzaSimples();
//        calabresa.setDecorator(catupiry);
//        catupiry.setDecorator(frango);
//        frango.setDecorator(tomate);
//        tomate.setDecorator(pizzaSimples);
       // System.out.println(calabresa.adicionar());
//        System.out.println(catupiry.adicionar());
//        System.out.println(frango.adicionar());
//        System.out.println(tomate.adicionar());
//        System.out.println(pizzaSimples.adicionar());
//        System.out.println(pizzaSimples.preparar());
//        System.out.println(tomate.preparar());
//        System.out.println(frango.preparar());
//        System.out.println(catupiry.preparar());
//        System.out.println(calabresa.preparar());
        
        
    //}
    public static void main(String[] arg) throws Exception  {
		    int op;
		    do{
		       File currentDir = new File("./plugins");
		       String []plugins = currentDir.list();
		       int i;
		       URL[] jars = new URL[plugins.length];
		       for (i = 0; i < plugins.length; i++){
			        System.out.println(i+1 + " - " + plugins[i].split("\\.")[0]);
			        jars[i] = (new File("./plugins/" + plugins[i])).toURL();
		       }
		       URLClassLoader ulc = new URLClassLoader(jars);
		       System.out.println(i+1 + " - Plugin refresh");
		       System.out.println("Escolha sua opção ou 0 para sair: ");
		       Scanner sc = new Scanner(System.in);
		       op = sc.nextInt();
		       if (op != 0 && op != i+1){
			       String factoryName = plugins[op-1].split("\\.")[0];
			       IComponente factory = (IComponente) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
			       //createProducts(factory);
		       }
		     } while (op != 0);
		  
	  }
}
