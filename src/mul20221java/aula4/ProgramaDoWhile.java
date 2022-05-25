/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author ProfAlexandre
 */
public class ProgramaDoWhile {
    
   public static void main(String args[] ) {
           
        int i = 0;
        do {
            JOptionPane.showMessageDialog(null, "I = " + i);
            i++;
        } while (i <= 10);
    }
}