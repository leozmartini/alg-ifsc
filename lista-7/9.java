import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 8. Anagrama: Escreva um programa que verifique se duas strings fornecidas pelo usuário são anagramas
        //(têm os mesmos caracteres em qualquer ordem)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String input = scanner.nextLine();

        String[] palavras = input.split(" ");
        String camelCase = palavras[0].toLowerCase();

        for (int i = 1; i < palavras.length; i++) {
            char firstChar = palavras[i].charAt(0);
            camelCase += Character.toString(firstChar).toUpperCase();

            for (int j = 1; j < palavras[i].length(); j++) {
                char lastChars = palavras[i].charAt(j);
                camelCase += Character.toString(lastChars).toLowerCase();

            }
        }

        System.out.println(camelCase);
    }
}