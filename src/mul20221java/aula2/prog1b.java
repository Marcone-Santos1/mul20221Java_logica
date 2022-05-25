/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula2;

import java.util.Scanner;

/**
 *
 * @author ProfAlexandre
 */
public class prog1b {
   
   public static void main(String args[]) {
       Scanner leia = new Scanner(System.in);
       
       String operacao;
       float valor1 = 0;
       float valor2 = 0;
       float resultado = 0; 
       
       System.out.println("Entre com a operacao");
       operacao = leia.nextLine();
       
       System.out.println("Entre com o valor 1");
       valor1 = leia.nextFloat();
       
       System.out.println("Entre com o valor 2");
       valor2 = leia.nextFloat();
       
       switch (operacao) {
           case "+":
               resultado = valor1 + valor2;
               break;
           case "-":
               resultado = valor1 - valor2;
               break;
           case "*":
               resultado = valor1 * valor2;
               break;
           case "/":
               resultado = valor1 / valor2;
               break;
           default:
               System.out.println("Erro na = " + operacao);
               break;
       }
       
       System.out.println("Resultado da Operacao = " + operacao);
       System.out.println("Valor = " + resultado);
       
   } 
}


