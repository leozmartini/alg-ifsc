import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 5. Matriz Identidade: Escreva um programa para criar uma matriz identidade de tamanho n × n.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor n");
        int input = scanner.nextInt();
        int[][] identidade = new int[input][input];

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (i == j) {
                    identidade[i][j] = 1;
                } else {
                    identidade[i][j] = 0;
                }
                System.out.print(identidade[i][j]);
            }
            System.out.println();
        }

    }
}