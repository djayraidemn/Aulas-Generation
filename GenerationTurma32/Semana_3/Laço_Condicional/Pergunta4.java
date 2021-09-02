package Laço_Condicional;

import java.util.Scanner;
public class Pergunta4 {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		double num,raiz,quad;
		
		System.out.println("Digite um número qualquer: ");
		num = leia.nextFloat();
		
		if(num % 2 == 0)
		{
			raiz = Math.sqrt(num); //sqrt = raiz quadrada
			System.out.println("Par: "+raiz);
		}
		else
		{
			quad = Math.pow(num,2); //pow = numero elevado ao quadrado
			System.out.println("Impar"+quad);
		}
	}

}
