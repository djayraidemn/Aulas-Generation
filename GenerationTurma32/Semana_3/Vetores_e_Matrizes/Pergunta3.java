package Vetores_e_Matrizes;

import java.util.Scanner;

public class Pergunta3 {
	public static void main(String []args)
	{
		/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		int matriz[][] = new int[3][3];
		int x,y,qtm10=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				System.out.println("DIGITE OS VALORES: ");
				matriz[x][y] = leia.nextInt();
				
				if(matriz[x][y] >= 10)
				{
					qtm10++;
				}
			}
		}
		for(x=0;x<3;x++)
		{
			for(y=0;y<3;y++)
			{
				if(matriz[x][y] >= 10)
				{
					System.out.println("\nVALORES INSERIDOS: "+matriz[x][y]);
				}
			}
		}
		System.out.println("possui: "+qtm10+" VALORES MAIOR QUE 10!");
	}
}
