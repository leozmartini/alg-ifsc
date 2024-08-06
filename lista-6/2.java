import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 2. Média dos Elementos: Escreva um programa para calcular a média dos elementos de uma matriz
        int[][] matriz = {{1,2,3}, {3,2,1}, {7,7,7} };
        int contadorElementos = 0;
        double media = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                contadorElementos++;
                media += matriz[i][j];
            }
        }

        System.out.println(media / contadorElementos);
    }
}