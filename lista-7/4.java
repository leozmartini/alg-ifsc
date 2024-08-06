import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 4. Remover Espaços: Escreva um programa que remova todos os espaços de uma string fornecida pelo
        //usuário.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para remover os espaços");
        String input = scanner.nextLine();

        input = input.replace(" ", "");

        System.out.println(input);

    }
}