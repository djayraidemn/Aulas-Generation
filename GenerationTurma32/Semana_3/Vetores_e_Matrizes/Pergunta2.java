package Vetores_e_Matrizes;

import java.util.Scanner;

public class Pergunta2 {
	public static void main(String []args)
	{
		/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.*/
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[6];
		int somapar=0,par=0,impar=0,x=0;
		
		for (x=0;x<6;x++)
		{
			System.out.println("digite os numeros: ");
			vetor[x] = leia.nextInt();
			
			if(vetor[x] % 2 == 0)
			{
				somapar += vetor[x];
			}
			else
			{
				impar++;
			}
		}
		for (x=0;x<6;x++)
		{
			if(vetor[x] % 2 == 0)
			{
				System.out.println("NUMEROS PARES DIGITADOS: "+vetor[x]);
			}
			else
			{
				System.out.println("NUMEROS IMPARES DIGITADOS: "+vetor[x]);
			}
		}
		System.out.println("QUANTIDADE IMPARES DIGITADOS: "+impar);
		System.out.println("SOMA NUMEROS PARES: "+somapar);
	}
}
