package ExerciciosBasicos;

/*
 * Desafio
Neste problema, deve-se ler:
O c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1. 
O c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. 
Ap�s, calcule e mostre o valor a ser pago.
 */
import java.io.IOException;
import java.util.Scanner;

public class Segundo {
	
  public static void main(String[] args) throws IOException {

     Scanner leitor = new Scanner(System.in);
     //declarando a variavel
     double total=0d;

     for(int i = 0; i < 2; i++){

      System.out.println( (i + 1) + " Pe�a");

      int codigo1 = leitor.nextInt();
      int n1 = leitor.nextInt();
      double valor1 = leitor.nextDouble();

      total += (n1 * valor1);

     }

     System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
    }
	
}