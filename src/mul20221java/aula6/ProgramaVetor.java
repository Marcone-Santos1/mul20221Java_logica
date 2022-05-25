/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula6;

import javax.swing.JOptionPane;

/**
 *
 * @author ProfAlexandre
 */
public class ProgramaVetor {
    
    static int[] vetorInteiro; 
    
    public static void main (String args[]) {
       int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tamanho do vetor"));
       geraVetor(tamanho);
       mostraVetor();
       ordenarBubleSort();
       mostraVetor();
    }

    public static void geraVetor(int tamanho) {
        vetorInteiro = new int[tamanho] ;
        for (int i = 0 ; i < vetorInteiro.length; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor"));
            vetorInteiro[i] = valor;
        }    
    }       

    public static void mostraVetor() {
        for (int i = 0 ; i < vetorInteiro.length; i++) {
            JOptionPane.showMessageDialog(null, "Valor = " + vetorInteiro[i]);
        }    
    }
    
    public static void ordenarBubleSort() {
        // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
        for(int i = 0; i < vetorInteiro.length - 1; i++) {
        // for utilizado para ordenar o vetor.
            for(int j = 0; j < vetorInteiro.length - 1 - i; j++) {
        /* Se o valor da posição atual do vetor for maior que o proximo valor,
          então troca os valores de lugar no vetor. */
                if(vetorInteiro[j] > vetorInteiro[j + 1]) {
                    int aux = vetorInteiro[j];
                    vetorInteiro[j] = vetorInteiro[j + 1];
                    vetorInteiro[j + 1] = aux;
                }
            }          
        }
    }

}
