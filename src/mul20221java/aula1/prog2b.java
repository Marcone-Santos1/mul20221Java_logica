/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula1;

import javax.swing.JOptionPane;

/**
 *
 * @author ProfAlexandre
 */
public class prog2b {
    
        public static void main(String args[]) {
     
       int idade1;
       int idade2;

       idade1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade1"));
       idade2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade2"));
       

       if( idade1 > idade2) {
           JOptionPane.showMessageDialog(null,"Amigo 1 mais velho");
       } else {
           JOptionPane.showMessageDialog(null,"Amigo 2 mais velho");
       }
       
    }

    
}
