package ExerciciosBasicos;
/*
 * O objetivo deste desafio � resolv�-lo utilizando o seu conhecimento sobre Arrays, 
 * uma estrutura de dados que armazena uma cole��o de dados em um bloco de mem�ria. 
 * Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}, 
 * desenvolva um programa que retorne como resultado apenas os n�meros pares dessa array.
 */
public class Primeiro {
    public static void main(String[] args){

// TODO: Crie um Array de n�meros inteiros:
     int[] inteiros = {2, 3, 5, 7, 11, 13, 18, 34};

// TODO: Implemente um la�o de repeti��o que verifique APENAS seus n�meros Pares:
     for (int i = 0; i < inteiros.length; i++){
         if (inteiros[i] % 2 == 0){
                 System.out.println(inteiros[i]);
                } 
            }
    }

}