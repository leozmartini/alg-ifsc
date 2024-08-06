import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 7. Encontrar a Maior Palavra: Escreva um programa que encontre a maior palavra em uma string fornecida
        //pelo usuário.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para ver qual é a maior palavra");
        String input = scanner.nextLine();

        String maiorPalavra = "";
        String[] palavras = input.split(" ");

        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i].length() > maiorPalavra.length()) {
                maiorPalavra = palavras[i];
            }
        }
        System.out.println(maiorPalavra);
    }
}