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
public class ProgramaWhile {

    public static void main(String args[] ) {
           
        int i = 0;
        String ops = "S";
        while (ops.equals("S")) {
            JOptionPane.showMessageDialog(null, "I = " + i);
            i++;
            ops = JOptionPane.showInputDialog("Deseja continuar");
        }
    }
    
}
