package application;

import java.util.Scanner;

public class Application {

	private static final String RESPOSTA_ACEITE = "Sim";
	private static final String RESPOSTA_NEGACAO = "Não";

	public static void main(String[] args) {

		Vida jogoDaVida = new Vida();

		jogoDaVida.imprimirTabuleiro();

		while(desejaContinuar()) {
			jogoDaVida.simularNovaGeracao();
		}
		
		System.out.println("Ok, bye!");

	}

	public static Boolean desejaContinuar() {
		return solicitarResposta().equals(RESPOSTA_ACEITE);
	}

	public static String solicitarResposta() {

		Scanner scanner = new Scanner(System.in);
		String resposta = "";
		
		Boolean valid = false;

		while(!valid) {

			imprimirPergunta(resposta);
			resposta = scanner.nextLine();
			
			valid = isRespostaValida(resposta);
			
			if(!valid) {
				System.out.println("Resposta inválida.");
			}

		}

		return resposta;

	}
	
	private static boolean isRespostaValida(String resposta) {
		return resposta.equals(RESPOSTA_ACEITE) || resposta.equals(RESPOSTA_NEGACAO);
	}

	private static void imprimirPergunta(String resposta) {

		String out = "Deseja consultar a próxima geração?";
		System.out.println(out);

	}

}
