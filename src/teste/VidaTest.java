package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Vida;


public class VidaTest {

    Vida vida;

    @Test
	public void testConstrutor() {
        
        vida = new Vida();
        int[][] matriz = vida.getField();
        int tamanho = vida.getTamanho();

        for (int i = 0; i < tamanho; i++) {

			for (int j = 0; j < tamanho; j++) {

				assertNotNull(matriz[i][j]);
			}
		}
    }

    @Test
	public void testProximaGeracao() {

        Vida vida = new Vida();
        int tamanho = vida.getTamanho();

        int[][] matriz = {{0,0,0,0,1,0},
                          {0,0,1,0,0,1},
                          {0,1,1,0,1,0},
                          {0,0,1,0,0,0},
                          {1,0,0,0,0,1},
                          {0,0,0,0,0,0}};

        int[][] proximaGeracaoMatriz = {{0,0,0,0,0,0},
                                        {0,1,1,0,1,1},
                                        {0,0,0,0,0,0},
                                        {0,0,1,1,0,0},
                                        {0,0,0,0,0,0},
                                        {0,0,0,0,0,0}};


        vida.setField(matriz);
        int[][] matrizResultado = vida.proximaGeracao();

            for (int i = 0; i < 5; i++) { 

                for (int j = 0; j < 5; j++) {

                    assertEquals(proximaGeracaoMatriz[i][j], matrizResultado[i][j]);
                }

            }
    }

    @Test
	public void testContarVizinhos() {

        int[][] matriz = {{0,1,1},
                          {1,0,1},
                          {0,0,0}};

        Vida vida = new Vida();
        vida.setField(matriz);

        assertEquals(3, vida.contarVizinhos(0, 1));
        assertEquals(1, vida.contarVizinhos(1, 0));
        assertEquals(2, vida.contarVizinhos(0, 2));
        assertEquals(2, vida.contarVizinhos(1, 2));
    }
}