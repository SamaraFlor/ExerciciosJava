/*
 Desafio
Em um jogo 2D existe um rob� de limpeza que come�a na posi��o (0,0). 
Ele recebe alguns comandos atrav�s de uma sequ�ncia de movimentos. 
Os movimentos v�lidos s�o: 'W' (movimento para cima), "S"(movimento para baixo), 
"D"(movimento para direita) e "A"(movimento para esquerda). 
Voc� dever� verificar se ap�s completar seus movimentos o rob� se encontra na posi��o (0,0). 
Retorne true se o rob� retornar � origem ou false caso contr�rio. 
Assuma que a magnitude do movimento do rob� � a mesma para cada movimento.
 */


import java.util.*;
 
public class Exercicio02{
public static void main(String[] args){

	
        String posicao = new Scanner(System.in).nextLine();
 
        int x = 0;
        int y = 0;

      for (int i = 0; i < posicao.length(); i++)
        {
            char pc = posicao.charAt(i);
            if (pc == 'W')
            {
                    x++;
            }
                if (pc == 'S')
                {
                    x--;
                }
                if (pc == 'D')
                {
                    y++;
                }
                if (pc == 'A')
                {
                    y--;
                }
        }
 
            if (x == 0 && y == 0)
            {
                System.out.print("true");
            }
            else
            {
                System.out.print("false");
            }
 
}
}