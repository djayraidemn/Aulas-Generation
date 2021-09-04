package Vetores_e_Matrizes;

import java.util.Scanner;

public class Pergunta1 {
	public static void main(String []args)
	{
		/*1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
		 * O programa deve executar os seguintes passos: 
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
		(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
		final int vetor=6;
		int A[] = {1,0,5,-2,-5,7};
		int soma=0,x;
		Scanner leia = new Scanner(System.in);
		
		for (x=0;x<6;x++)
		{
			if(x==0 || x==1 || x==5)
				soma += A[x];
		}
		A[3] = 100;
		
		for (x=0;x<6;x++)
		{
			
			System.out.printf("\nPOSIÇÃO: "+(x+1)+" VALOR: "+A[x]);
			
			
		}
		System.out.printf("\n\nSOMA: "+soma);
	}
}
