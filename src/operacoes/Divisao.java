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
public class Divisao extends Operacoes{
    
    @Override
    public void Calcular(double a, double b) {
        
        try {    
            resultado = a / b;
            if(Double.isFinite(resultado)) throw new ArithmeticException();
            System.out.println("O resultado da divisao é:"
                + String.format("%.2f", resultado));
        }
        catch(ArithmeticException e){
            System.err.println("Erro de divisão por zero");
        }
        catch (Throwable e) {
            System.err.println("Erro!");
        }
        finally{
            System.out.println("Amanhã é feriado!");
            
        }
        
    
   }

}