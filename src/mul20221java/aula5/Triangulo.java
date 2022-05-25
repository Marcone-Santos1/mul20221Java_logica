/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mul20221java.aula5;

import java.math.*;

public class Triangulo {
    private final float lado1, lado2, lado3;
    private final String tipoTriangulo;
    private String tipoAngulo = "";
    private double retorno;
    
    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        
        if (lado1 < (lado2+lado3) && lado2 < (lado1+lado3) && lado3 < (lado1+lado2)){
            if (lado1 == lado2 && lado1 == lado3) {
                this.tipoTriangulo = "equilátero";
                this.tipoAngulo = "Actangulo";
            } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
                this.tipoTriangulo = "isósceles";
            } else {
                this.tipoTriangulo = "escaleno";
            }
        } else {
                this.tipoTriangulo = "Não é Triangulo";
                this.tipoAngulo = "";
        }
                int l1 = (int) lado1;
                int l2 = (int) lado2;
                int l3 = (int) lado3;
                retorno = calculoangulo(l1, l2, l3, 1);
                System.out.println("" + retorno);

    }
    
    public static double calculoangulo(int a, int b, int c, int angulo){

      double angab,angac,angbc,angulofinal=0;

           if(angulo==1){
               angab=(((a*a)+(b*b))-(c*c))/(2*a*b);
               angulofinal=angab;
                    }else{if(angulo==2){
                        angac=(((a*a)+(c*c))-(b*b))/(2*a*b);
                        angulofinal=angac;
                       }else{if(angulo==3){
                           angbc=(((b*b)+(c*c))-(a*a))/(2*a*b);
                           angulofinal=angbc;
                             }
                            }
                           }
               return Math.acos(angulofinal);   
    }

    
    public float getLado1() {
        return lado1;
    }
    public float getLado2() {
        return lado2;
    }
    public float getLado3() {
        return lado3;
    }
    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public String getTipoAngulo() {
        return tipoAngulo;
    }

    public float getPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    public float getArea() {
        float p = this.getPerimetro() / 2;
        return (float) Math.sqrt(p * (p - this.lado1) * (p - this.lado2) * (p - this.lado3));
    }
}