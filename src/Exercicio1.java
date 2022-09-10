/*
 * Desafio
Dado um inteiro x, 
retorne o n�mero de etapas para reduzi-lo a zero. 
Em uma etapa, se o n�mero atual for par, voc� deve dividi-lo por 2, 
caso contr�rio, voc� deve subtrair 1 dele.
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