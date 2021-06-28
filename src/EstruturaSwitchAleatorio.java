import java.util.Random;

public class EstruturaSwitchAleatorio {

	public static void main(String[] args) {
		/*Crie um programa que permita ao usuário escolher o elogio que gostaria de receber, de acordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio físico, 3 - Elogio pessoal
		 * Caso digite qualquer outro número, deve ser exibida a mensagem "opção inválida"*/
		Random gerador = new Random();
		int opcao;
		System.out.println("ELOGIADOR!");
		opcao = gerador.nextInt(3);
		System.out.println(opcao);
		//Aqui precisamos de uma estrutura para validar a opção inserida.
		switch(opcao)
		{
		case 0:
			System.out.println("Os seus ifs são lindos demais!");
			break;
		case 1:
			System.out.println("A sua densidade óssea é incrível!");
			break;
		case 2:
			System.out.println("Você é uma pessoa sensacional!");
			break;
		default:
			System.out.println("Opção inválida");
		}

	}

}
