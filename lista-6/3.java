import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 3. Maior Elemento: Escreva um programa para encontrar o maior elemento de uma matriz.
        int[][] matriz = {{1,2,3}, {3,2,1}, {7,7,7} };
        int maiorElemento = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (maiorElemento < matriz[i][j]) {
                    maiorElemento = matriz[i][j];
                }
            }
        }
        System.out.println(maiorElemento);
    }
}