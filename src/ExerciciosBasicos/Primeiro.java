package ExerciciosBasicos;
/*
 * O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, 
 * uma estrutura de dados que armazena uma coleção de dados em um bloco de memória. 
 * Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}, 
 * desenvolva um programa que retorne como resultado apenas os números pares dessa array.
 */
public class Primeiro {
    public static void main(String[] args){

// TODO: Crie um Array de números inteiros:
     int[] inteiros = {2, 3, 5, 7, 11, 13, 18, 34};

// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
     for (int i = 0; i < inteiros.length; i++){
         if (inteiros[i] % 2 == 0){
                 System.out.println(inteiros[i]);
                } 
            }
    }

}