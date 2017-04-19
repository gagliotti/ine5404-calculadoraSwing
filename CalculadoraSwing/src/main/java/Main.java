
import ine5404.controle.Controle;
import ine5404.visao.Moldura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin.vigil
 */
public class Main {
    public static void main(String args[])
    {
        Controle controle = new Controle();
        Moldura moldura = new Moldura(controle);
    }
}
