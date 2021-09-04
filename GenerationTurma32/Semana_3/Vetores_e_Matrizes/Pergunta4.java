package Vetores_e_Matrizes;

import java.util.Scanner;

public class Pergunta4 {
	public static void main(String []args)
	{
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado 
		na própria matriz.*/
		float matriz1[][] = new float [2][2];
		float matriz2[][] = new float [2][2];
		float matriz3[][] = new float [2][2];
		Scanner leia = new Scanner(System.in);
		int x,y=0,c,o;
		
		for(x=0;x<2;x++)
		{
			for(y=0;y<2;y++)
			{
				System.out.println("Digite o Valor da Matriz 1: ");
				matriz1[x][y] = leia.nextInt();
				System.out.println("Digite o Valor da Matriz 2: ");
				matriz2[x][y] = leia.nextInt();
			}
		}
		System.out.println("\n\tEscolha sua Opção: ");
		System.out.println("\n1 - SOMA");
		System.out.println("\n2 - DIFERENÇA");
		System.out.println("\n3 - CONSTANTE");
		System.out.println("\n4 - IMPRIMA");
		System.out.println("\n\nDigite a Opção: ");
		o = leia.nextInt();
		switch(o)
		{
			case 1:
				for(x=0;x<2;x++)
				{
					for(y=0;y<2;y++)
					{
						matriz3[x][y] = matriz3[x][y] + matriz1[x][y];
						matriz3[x][y] = matriz3[x][y] + matriz2[x][y];
						System.out.printf("\nSOMA: "+matriz3[x][y]);
					}
				}
				break;
			case 2:
				for(x=0;x<2;x++)
				{
					for(y=0;y<2;y++)
					{
						matriz3[x][y] = matriz3[x][y] - matriz1[x][y];
						matriz3[x][y] = matriz3[x][y] - matriz2[x][y];
						System.out.printf("\nDIFERENÇA: "+matriz3[x][y]);
					}
				}
				break;
			case 3:
				for(x=0;x<2;x++)
				{
					for(y=0;y<2;y++)
					{
						System.out.println("\nDigite o valor da constante: ");
						matriz3[x][y] = leia.nextInt();
						matriz3[x][y] = matriz3[x][y] + matriz2[x][y];
						matriz3[x][y] = matriz3[x][y] + matriz1[x][y];
					}
				}
				for(x=0;x<2;x++)
				{
					for(y=0;y<2;y++)
					{
						System.out.printf("\nCONSTANTE: "+matriz3[x][y]);
					}
				}
				break;
			case 4:
				for(x=0;x<2;x++)
				{
					for(y=0;y<2;y++)
					{
						System.out.printf("\nMATRIZ 1: "+matriz1[x][y]);
					}
				}
				for(x=0;x<2;x++)
				{
					for(y=0;y<2;y++)
					{
						System.out.printf("\nMATRIZ 2: "+matriz2[x][y]);
					}
				}
				break;
				default:
					System.out.println("\nErrado!!!");
		}
	}
}
