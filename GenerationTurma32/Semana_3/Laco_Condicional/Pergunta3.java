package Laço_Condicional;

import java.util.*;
public class Pergunta3
{
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		int idade;
		
		System.out.println("Digite Sua Idade: ");
		idade = leia.nextInt();
		
		if(idade >= 18)
		{
			System.out.println("Adulto");
		}
		if(idade<=17 && idade>=15)
		{
			System.out.println("Juvenil");
		}
		if(idade <=14)
		{
			System.out.println("Infantil");
		}
	}
}
