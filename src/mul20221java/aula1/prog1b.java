/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula1;
// estou importanto a classe Jop para criar caixa de texto
import javax.swing.JOptionPane;

/**
 *
 * @author ProfAlexandre
 */
public class prog1b {
    
    public static void main(String args[]) {
        String nome;
        String ra;
        
        nome = JOptionPane.showInputDialog("Entre com o nome");
        ra = JOptionPane.showInputDialog("Entre com o ra");

        JOptionPane.showMessageDialog(null,"Nome = " + nome);
        JOptionPane.showMessageDialog(null,"Ra = " + ra);     
 
    }  
}
