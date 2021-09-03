package Lacos_de_Repeticao;

public class Pergunta1
{
	public static void main(String []args)
	/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		obtemos resto = 5. (FOR)*/
	{
		float resto;
		int x;
		
		for(x=1000;x<=1999;x++)
		{
			resto = x % 11;
			if(resto % 11 == 5)
			{
				System.out.printf("\nO número da divisão obtido o resto por %.0f é: %d",resto,x);
			}
			else
			{
				x++;
			}
		}
	}
}
