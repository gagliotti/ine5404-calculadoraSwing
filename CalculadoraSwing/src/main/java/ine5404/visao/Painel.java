package ine5404.visao;





import ine5404.controle.Controle;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author martin.vigil
 */
public class Painel extends javax.swing.JPanel {

    protected Controle controle;
    /**
     * Creates new form Painel
     */
    public Painel(Controle controle) {
        this.controle = controle;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        entradaNumero1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        entradaNumero2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelResultado = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setLayout(new java.awt.GridLayout(6, 2, 6, 2));

        jLabel5.setText("First Number");
        add(jLabel5);

        entradaNumero1.setToolTipText("Digite um número");
        entradaNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNumero1ActionPerformed(evt);
            }
        });
        add(entradaNumero1);

        jLabel6.setText("Second Number");
        add(jLabel6);
        add(entradaNumero2);

        jLabel4.setText("Resultado");
        add(jLabel4);
        add(labelResultado);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somar(evt);
            }
        });
        add(jButton1);

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tratarBotaoSubtrairClicado(evt);
            }
        });
        add(jButton2);

        jButton3.setText("*");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tratarBotaoMultiplicarClicado(evt);
            }
        });
        add(jButton3);

        jButton4.setText("/");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acaoMouseSaiu(evt);
            }
        });
        add(jButton4);

        jButton5.setText("%");
        add(jButton5);

        jButton6.setText("CLEAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar(evt);
            }
        });
        add(jButton6);
    }// </editor-fold>//GEN-END:initComponents

    private void somar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somar
        Double soma = this.controle.somar(this.entradaNumero1.getText(), this.entradaNumero2.getText());
        this.labelResultado.setText(soma.toString());
    }//GEN-LAST:event_somar

    private void entradaNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaNumero1ActionPerformed

    private void limpar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar
        this.entradaNumero1.setText("");
        this.entradaNumero2.setText("");
        this.labelResultado.setText("");
    }//GEN-LAST:event_limpar

    private void acaoMouseSaiu(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acaoMouseSaiu
       JOptionPane.showMessageDialog(null,"Passou por cima");
    }//GEN-LAST:event_acaoMouseSaiu

    private void tratarBotaoSubtrairClicado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tratarBotaoSubtrairClicado
        this.entradaNumero1.getText();
    }//GEN-LAST:event_tratarBotaoSubtrairClicado

    private void tratarBotaoMultiplicarClicado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tratarBotaoMultiplicarClicado
        JOptionPane.showConfirmDialog(null, "Ainda não implementado");
    }//GEN-LAST:event_tratarBotaoMultiplicarClicado


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField entradaNumero1;
    private javax.swing.JTextField entradaNumero2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelResultado;
    // End of variables declaration//GEN-END:variables
}
