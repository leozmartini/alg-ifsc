import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 4. Média das Linhas/Colunas: Calcule a média de cada linha e de cada coluna de uma matriz.
        int[][] matriz = {{1,2,3}, {3,2,1}, {7,7,7} };
        int contadorElementos = 0;
        double[] mediaLinha = new double[3];
        double[] mediaColuna = new double[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                contadorElementos ++;
                mediaLinha[i] += matriz[i][j];

                mediaColuna[i] += matriz[j][i];
            }

            System.out.println("Linha");
            System.out.println(mediaLinha[i] / contadorElementos);

            System.out.println("Coluna");
            System.out.println(mediaColuna[i] / contadorElementos);
            contadorElementos = 0;
        }

    }
}