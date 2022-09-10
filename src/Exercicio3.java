import java.util.Scanner;

/*
Desafio
Dado um inteiro positivo num, retorne o número de inteiros positivos 
menor ou igual a num cuja soma de dígitos é par. 
A soma dos dígitos de um inteiro positivo é a soma de todos os seus dígitos.
 */

import java.util.*;
 
public class Exercicio3 {
	public static void main(String[] args) {
		
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int contador = 0;

        for (int i = 1; i <= num; i++)
        {
           String strNum = String.valueOf(i);
            if (strNum.length() == 1)
            {
                if (i % 2 == 0)
                {
                    contador++;
                }
                continue;
            }
            char[] arr = strNum.toCharArray();
            var sum = 0;
            for (var j = 0; j < arr.length; j++)
            {
                sum += (int)Character.getNumericValue(arr[j]);
            }
            if (sum % 2 == 0)
            {
                contador++;
            }
        }
        System.out.println(contador);
    }
}
