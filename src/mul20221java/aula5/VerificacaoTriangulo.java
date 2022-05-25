/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula5;

import javax.swing.JOptionPane;

/**
 *
 * @author ProfAlexandre
 */
public class VerificacaoTriangulo {
    
    public static void main(String args[] ) {
        String ops = "S";
        while (ops.equals("S")) {
            calculaTrianguloAngulo();
            ops = JOptionPane.showInputDialog("Deseja continuar");
        }
    }
    
    public static void calculaTrianguloAngulo() {
            float X,Y,Z;
            X=Float.parseFloat(JOptionPane.showInputDialog("Digite um valor X:  "));
            Y=Float.parseFloat(JOptionPane.showInputDialog("Digite um valor Y:  "));
            Z=Float.parseFloat(JOptionPane.showInputDialog("Digite um valor Z:  "));
            Triangulo t = new Triangulo (X,Y,Z);
    }
}
