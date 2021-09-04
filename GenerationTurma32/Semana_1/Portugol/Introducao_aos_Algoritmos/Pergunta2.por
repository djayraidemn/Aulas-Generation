programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro IN,ID,MES,DIA

		escreva("Digite o total de dias da sua idade: ")
		leia(IN)

		ID=(IN/365)
		MES=(IN%365)/30
		DIA=(IN%365)%30

		escreva("\nA representação de sua idade seria: ",
		ID," Anos de idade, ",MES," Meses percorridos e ",DIA," Dias percorridos.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */