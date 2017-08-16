package ine5404.visao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import ine5404.controle.Controle;
import javax.swing.JFrame;

/**
 *
 * @author martin.vigil
 */
public class Moldura extends JFrame {
    
    public Moldura(Controle controle){
        this.add(new Painel(controle));
        this.pack(); //define o tamanho ideal do jframe
        this.setVisible(true); //torna o jframe e seus componentes visiveis
    }
}
