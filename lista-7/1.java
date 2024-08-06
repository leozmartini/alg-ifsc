import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Contar Caracteres: Escreva um programa que leia uma string fornecida pelo usuário e conte o número de caracteres (incluindo espaços).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a string");
        String input = scanner.nextLine();

        System.out.println(input.length());
    }
}