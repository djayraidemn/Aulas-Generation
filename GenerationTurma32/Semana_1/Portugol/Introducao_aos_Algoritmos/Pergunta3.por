programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro IN,HRS,MIN,SEG

		escreva("Digite o total de segundos percorrido: ")
		leia(IN)

		HRS=(IN/60)/60
		MIN=(IN/60)%60
		SEG=(IN%60)%60

		escreva("\nO total de horas percorrido foi: ",
		HRS," horas ",MIN," minutos e ",SEG," segundos.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */