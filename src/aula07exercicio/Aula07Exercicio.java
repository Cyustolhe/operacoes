/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07exercicio;

import java.util.Scanner;
import operacoes.Divisao;
import operacoes.Soma;

/**
 *
 * @author professor
 */
public class Aula07Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n1, n2;
        char operacoes;
        
        
        Scanner s = new Scanner(System.in);
        
        n1 = s.nextDouble();
        n2 = s.nextDouble();
        operacoes = s.next().charAt(0);
        
        if(operacoes == '+'){
            Soma soma = new Soma();
            soma.Calcular(n1, n2);
        } else if(operacoes == '/'){
            Divisao divisao = new Divisao();
            divisao.Calcular(n1, n2);
        }
        
    }
    
}
