import java.util.Random;

public class EstruturaSwitchAleatorio {

	public static void main(String[] args) {
		/*Crie um programa que permita ao usu�rio escolher o elogio que gostaria de receber, de acordo com a seguinte regra: 1 - Elogio profissional, 2 - Elogio f�sico, 3 - Elogio pessoal
		 * Caso digite qualquer outro n�mero, deve ser exibida a mensagem "op��o inv�lida"*/
		Random gerador = new Random();
		int opcao;
		System.out.println("ELOGIADOR!");
		opcao = gerador.nextInt(3);
		System.out.println(opcao);
		//Aqui precisamos de uma estrutura para validar a op��o inserida.
		switch(opcao)
		{
		case 0:
			System.out.println("Os seus ifs s�o lindos demais!");
			break;
		case 1:
			System.out.println("A sua densidade �ssea � incr�vel!");
			break;
		case 2:
			System.out.println("Voc� � uma pessoa sensacional!");
			break;
		default:
			System.out.println("Op��o inv�lida");
		}

	}

}
