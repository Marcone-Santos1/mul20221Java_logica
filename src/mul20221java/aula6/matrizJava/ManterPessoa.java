/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula6.matrizJava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class ManterPessoa {

    static List<Pessoa> lp;    

    public static void main (String args[]){
        montarList();
        mostraList();
    }

    public static void montarList() {
        lp = new ArrayList<>();
        for (int i = 0; i < 3 ; i++) {
            String nome = "Alexandre " + i;
            String cpf = "135.08.885 " + i;
            String idade = "48 " + i;
            Pessoa p = new Pessoa(nome,cpf,idade);
            lp.add(p);
        }
        
    }
        
    public static void mostraList() {
        for (int i = 0; i < 3 ; i++) {
            System.out.println(lp.get(i).toString());
        }
    }

}
