programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro ID,MES,DIA,OUT
		
		escreva("Digite a sua idade: ")
		leia(ID)
		escreva("\nDigite o restante dos meses: ")
		leia(MES)
		escreva("\nDigite o restante de dias: ")
		leia(DIA)

		OUT=(ID*365)+(MES*30)+DIA

		escreva("\nO total de dias é: ",OUT,".\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */