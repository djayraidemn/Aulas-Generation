package Laço_Condicional;

import java.util.*;

public class Pergunta2
{
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Digite a Primeira Entrada: ");
		a = leia.nextInt();
		System.out.println("\nDigite a Segunda Entrada");
		b = leia.nextInt();
		System.out.println("\nDigite a Terceira Entrada");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("Foi Imprimido Valores na Ordem Crescente de: "+a+" , "+b+" e "+c+".");
		}
		else if(a<=c && c<=b)
		{
			System.out.println("Foi Imprimido Valores na Ordem Crescente de: "+a+" , "+c+" e "+b+".");
		}
		else if(c<=a && a<=b)
		{
			System.out.println("Foi Imprimido Valores na Ordem Crescente de: "+c+" , "+a+" e "+b+".");
		}
		else if(c<=b && b<=a) 
		{
			System.out.println("Foi Imprimido Valores na Ordem Crescente de: "+c+" , "+b+" e "+a+".");
		}
		else if(b<=a && a<=c)
		{
			System.out.println("Foi Imprimido Valores na Ordem Crescente de: "+b+" , "+a+" e "+c+".");
		}
		else
		{
			System.out.println("Foi Imprimido Valores na Ordem Crescente de: "+b+" , "+c+" e "+a+".");
		}
	}
}
