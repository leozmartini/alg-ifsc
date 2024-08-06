import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 3. Contar Vogais: Escreva um programa que conte o número de vogais em uma string fornecida pelo usuário

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para contar as vogais");
        String input = scanner.nextLine().toLowerCase();

        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int contador = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (input.charAt(i) == vogais[j]) {
                    contador++;
                }
            }
        }

        System.out.println(contador);

    }
}