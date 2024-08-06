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
        String palavra1 = scanner.nextLine().toLowerCase();

        System.out.println("Digite outra palavra");
        String palavra2 = scanner.nextLine().toLowerCase();

        char[] chars1 = palavra1.toCharArray();
        char[] chars2 = palavra2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        System.out.println(Arrays.equals(chars1, chars2));

    }
}