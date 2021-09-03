package Lacos_de_Repeticao;

import java.util.Scanner;

public class Pergunta2
{
	public static void main(String []args)
	{
		Scanner leia = new Scanner(System.in);
		int par=0,impar=0,x,y;
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Digite os números: ");
			y = leia.nextInt();
			
			if(y % 2 == 0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.printf("\nA quantidade de pares foi: : "+par);
		System.out.printf("\nE a quantidade de impares foi: "+impar);
	}
}
