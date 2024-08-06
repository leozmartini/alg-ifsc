import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Soma dos Elementos: Escreva um programa para calcular a soma dos elementos de uma matriz.
        int[][] matriz = {{1,2,3}, {3,2,1}, {7,7,7} };

        int resultado = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                resultado += matriz[i][j];
            }
        }
        System.out.println(resultado);
    }
}