/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author ProfAlexandre
 */
public class progIfEncadeado {
    
    public static void main(String args[] ) {
        
            String labLogin = "Entre com Login";
            String labSenha = "Entre com Senha";
        
            String logExit = "BITTENCOURT";
            String senExit = "BIT";
            
            String msgLogin = "Login inválido";
            String msgSenha = "Senha inválida";
            String msgValido = "Usuario válido";
            String msginValido = "Usuario inválido";


            String login = JOptionPane.showInputDialog(labLogin);
            String senha = JOptionPane.showInputDialog(labSenha);
            
            if(login.equals(logExit)) {
                if(senha.equals(senExit)) {
                 JOptionPane.showMessageDialog(null,msgValido);
                } else {
                 JOptionPane.showMessageDialog(null,msgSenha);
                }
                    
            } else {
                JOptionPane.showMessageDialog(null,msgLogin);
            }
            
            if( (login.equals(logExit)) && (senha.equals(senExit)) ) {
                JOptionPane.showMessageDialog(null,msgValido);
            } else {
                JOptionPane.showMessageDialog(null,msginValido);
            }
        
    }
    
}
