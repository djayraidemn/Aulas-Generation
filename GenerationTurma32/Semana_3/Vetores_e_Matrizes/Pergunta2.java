package Vetores_e_Matrizes;

import java.util.Scanner;

public class Pergunta2 {
	public static void main(String []args)
	{
		/*2- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.*/
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
