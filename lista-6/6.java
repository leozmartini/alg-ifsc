import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 6. Produto Escalar: Implemente uma função que calcule o produto escalar de duas matrizes.

        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matriz2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        // Consideramos que será usada apenas as 2 acima. Assim não necessário verificar se as 2 tem mesmo tamanho.
        int[][] soma = new int[matriz1.length][matriz1.length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

    }
}