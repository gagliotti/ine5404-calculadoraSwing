package ine5404.controle;

import ine5404.modelo.Calculadora;
import ine5404.modelo.ICalculadora;



/**
 *
 * @author martin.vigil
 */
public class Controle {
    protected ICalculadora calculadora;
    
    public Controle(){
        this.calculadora = new Calculadora();
    }
    
    public Double somar(String entrada1, String entrada2){
        Double numero1 = new Double(entrada1);
        Double numero2 = new Double(entrada2);
        return this.calculadora.somar(numero1, numero2);
    }
    
     public Double subtrair(String entrada1, String entrada2){
        Double numero1 = new Double(entrada1);
        Double numero2 = new Double(entrada2);
        return this.calculadora.subtrair(numero1, numero2);
    }
     
       public Double dividir(String entrada1, String entrada2){
        Double numero1 = new Double(entrada1);
        Double numero2 = new Double(entrada2);
        return this.calculadora.dividir(numero1, numero2);
    }
}
