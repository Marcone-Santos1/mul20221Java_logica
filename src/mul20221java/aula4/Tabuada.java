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
public class Tabuada {
    
    public static void main(String args[] ) {
        String msgSaida = "";
        String msgEntrada = "Informa qual Tabuada";
        int tabuada = Integer.parseInt(JOptionPane.showInputDialog(msgEntrada));
        msgSaida = "Tabuada do " + tabuada + "\n";
        for(int i = 0 ; i <= 10 ; i++) {
            msgSaida += tabuada + " x " + i + " = " + tabuada * i + "\n";
        }
        JOptionPane.showMessageDialog(null, msgSaida);
    }

    
}
