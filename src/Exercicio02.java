/*
 Desafio
Em um jogo 2D existe um robô de limpeza que começa na posição (0,0). 
Ele recebe alguns comandos através de uma sequência de movimentos. 
Os movimentos válidos são: 'W' (movimento para cima), "S"(movimento para baixo), 
"D"(movimento para direita) e "A"(movimento para esquerda). 
Você deverá verificar se após completar seus movimentos o robô se encontra na posição (0,0). 
Retorne true se o robô retornar à origem ou false caso contrário. 
Assuma que a magnitude do movimento do robô é a mesma para cada movimento.
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