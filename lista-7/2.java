import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 2. Palíndromo: Escreva um programa que verifique se uma string fornecida pelo usuário é um palíndromo
        //(lê-se da mesma forma de trás para frente).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificar se é Palíndromo");
        String input = scanner.nextLine();

        String reverseInput = "";
        for (int i = input.length() -1; i >= 0; i--) {
            reverseInput += input.charAt(i);
        }

        if (reverseInput.equals(input)) {
            System.out.println("A palavra é Palíndromo");
        } else {
            System.out.println("A palavra não é Palíndromo");
        }
    }
}