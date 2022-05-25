/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula1;

import java.util.Scanner;

/**
 *
 * @author ProfAlexandre
 */
public class prog1a {
    
   public static void main(String args[]) {
       Scanner leia = new Scanner(System.in);
       
       String nome;
       String ra;

       System.out.println("Entre com o nome");
       nome = leia.nextLine();
       
       System.out.println("Entre com o Ra");
       ra = leia.nextLine();
       
       System.out.println("Nome = " + nome);
       System.out.println("Ra = " + ra);
       
   } 
   
    
}
