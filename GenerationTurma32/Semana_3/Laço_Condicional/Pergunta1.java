package Laço_Condicional;

import java.util.*;

public class Pergunta1
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		int valor1,valor2,valor3;
		
		System.out.println("Digite a Primeira Entrada: ");
		valor1 = ler.nextInt();
		System.out.println("\nDigite a Segunda Entrada: ");
		valor2 = ler.nextInt();
		System.out.println("\nDigite a Terceira Entrada: ");
		valor3 = ler.nextInt();
		
		if(valor1 > valor2 && valor1 > valor3)
		{
			System.out.printf("\nO Maior Valor Encontrado foi na Primeira Entrada de: "+valor1+"!");
		}
		else if(valor2 > valor1 && valor2 > valor3)
		{
			System.out.printf("\nO Maior Valor Encontrado foi na Segunda Entrada de: "+valor2+"!");
		}
		else
		{
			System.out.printf("\nO Maior Valor Encontrado foi na Terceira Entrada de: "+valor3+"!");
		}
	}
}
