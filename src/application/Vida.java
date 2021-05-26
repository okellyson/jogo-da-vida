package application;

public class Vida {
	
	private int tamanho;

	private int field[][];

	public Vida () {

		this.tamanho = 6;
		this.field = new int[this.tamanho][this.tamanho];
		
		for (int i = 1; i < (this.tamanho - 1); i++) {

			for (int j = 1; j < (this.tamanho - 1); j++) {
				this.field[i][j] = (int) (Math.random() * 1.5);
			}

		}

	}

	private int getVizinho(int i, int j){

		try {
			return field[i][j];
		} catch (Exception e) {
			return 0;
		}

	}

	public int contarVizinhos(int i, int j) {

				// Linha acima
		return  getVizinho(i-1, j-1) +
				getVizinho(i-1, j+1) +
				getVizinho(i-1, j) +

				// Linha atual
				getVizinho(i, j-1) +
				getVizinho(i, j+1) +

				// Linha abaixo
				getVizinho(i+1, j-1) +
				getVizinho(i+1, j+1) +
				getVizinho(i+1, j);

	}

	public int[][] proximaGeracao() {

		int nextField[][] = new int[this.tamanho][this.tamanho];
		
		int vizinhos = 0;

		for (int i = 0; i < this.tamanho; i++) {

			for (int j = 0; j < this.tamanho; j++) {
				
				vizinhos = contarVizinhos(i, j);

				if (field[i][j] == 1) {

					if (vizinhos < 2 || vizinhos > 3) {
						nextField[i][j] = 0;
					} else {
						nextField[i][j] = 1;
					}

				} else {

					if (vizinhos == 3) {
						nextField[i][j] = 1;
					} else {
						nextField[i][j] = 0;
					}

				}

			}

		}

		return nextField;

	}

	public void simularNovaGeracao() {
		
		imprimirTabuleiro();
		
		this.field = proximaGeracao();

		System.out.println("\nNova geração:");
		imprimirTabuleiro();
		
		System.out.println("---");

	}
	
	public void imprimirTabuleiro() {
		
		System.out.println();

		for (int i = 0; i < this.tamanho; i++) {

			for (int j = 0; j < this.tamanho; j++) {
				System.out.print(this.field[i][j] + " ");
			}

			System.out.println();

		}

		System.out.println();

	}
	
	public int getTamanho() {
		return this.tamanho;
	}

	public int[][] getField() {
		return this.field;
	}

	public void setField(int[][] matriz) {
		this.field = matriz;
	}


}
