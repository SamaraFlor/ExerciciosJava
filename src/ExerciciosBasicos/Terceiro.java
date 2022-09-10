package ExerciciosBasicos;

/*
 * Desafio
Faça um programa que leia um valor T e preencha um vetor N[1000] 
com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. 
Imprima o vetor N.
 */

import java.util.Scanner; 

public class Terceiro {
    
public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 

   //System.out.println("Digite o valor de T");
 int t = leitor.nextInt(); 

    for(int i = 0 ; i < 1000;){
        for(int v = 0; v < t ;v++){
            if(2 <= t && t <= 50 && i < 1000){
                System.out.println("N[" + i + "] = "+ v);
                i++;
            }
        }
    }
}

}