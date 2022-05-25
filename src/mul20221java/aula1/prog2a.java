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
public class prog2a {
    
    public static void main(String args[]) {
    
       Scanner leia = new Scanner(System.in);
       
       int idade1;
       int idade2;

       System.out.println("Entre com a idade 1");
       idade1 = leia.nextInt();
       
       System.out.println("Entre com a idade 2");
       idade2 = leia.nextInt();
       

       if( idade1 > idade2) {
           System.out.println("Amigo 1 mais velho");
       } else {
           System.out.println("Amigo 2 mais velho");
       }
       
    }
}
