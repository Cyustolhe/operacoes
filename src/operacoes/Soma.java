/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacoes;

/**
 *
 * @author professor
 */
//Classe filha de superclasse Operacao
public class Soma extends Operacoes {

    @Override
    public void Calcular(double a, double b) {
        resultado = a +b;
        System.out.println("O resultado da soma é: " +String.format("%.2f" , resultado));
    }
    
    
}
 
//CTRL+Barra de espaço