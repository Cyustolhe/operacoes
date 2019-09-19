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
public class Subtracao extends Operacoes{

    @Override
    public void Calcular(double a, double b) {
            resultado = a - b;
            System.out.println("O resultado da subtracao é:"
                + String.format("%.2f", resultado));
        
        
        
    }
    
    
    
    
    
    
    
}

