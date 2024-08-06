import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //7. Transposição de Matriz: Escreva um código para transpor uma matriz dada.

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transposta = new int[matriz.length][matriz.length];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                transposta[i][j] = matriz[j][i];

                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

    }
}