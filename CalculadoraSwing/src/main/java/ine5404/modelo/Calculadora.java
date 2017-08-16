/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.modelo;

/**
 *
 * @author martin
 */
public class Calculadora implements ICalculadora {
    
    @Override
    public Double somar(Double x, Double y){
        return x + y;
    }
    
    @Override
    public Double subtrair(Double x, Double y){
        return x - y;
    }
    
    @Override
    public Double dividir(Double x, Double y){
        return x / y;
    }
}
