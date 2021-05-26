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

	}

	public static Boolean desejaContinuar() {
		return solicitarResposta().equals(RESPOSTA_ACEITE);
	}

	public static String solicitarResposta() {

		Scanner scanner = new Scanner(System.in);
		String resposta = "";

		while(!(resposta.equals(RESPOSTA_ACEITE) || resposta.equals(RESPOSTA_NEGACAO))) {

			imprimirPergunta(resposta);
			resposta = scanner.nextLine();

		}

		return resposta;

	}

	private static void imprimirPergunta(String resposta) {

		String out = (resposta.equals("") ? "Resposta inválida. " : "") + "Deseja consultar a próxima geração?";
		System.out.println(out);

	}

}
