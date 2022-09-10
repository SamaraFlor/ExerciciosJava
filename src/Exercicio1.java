/*
 * Desafio
Dado um inteiro x, 
retorne o número de etapas para reduzi-lo a zero. 
Em uma etapa, se o número atual for par, você deve dividi-lo por 2, 
caso contrário, você deve subtrair 1 dele.
 */

import java.util.*;
 
public class Exercicio1
{
    public static void main(String[] args)
    {
        System.out.println("Digite um numero inteiro");
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var numero = 0;

        while (num > 0)
        {
            if ((num & 1) == 1)
            {
                numero++;
            }
            num /= 2;
            numero++;
        }

	    System.out.println(numero - 1);
    }
}