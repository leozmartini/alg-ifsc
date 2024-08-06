import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 5. Substituir Caracteres: Escreva um programa que substitua todos os espaços em uma string por um
        //caractere específico (por exemplo, ’-’). A string e o caractere devem ser fornecidos pelo usuário.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String input = scanner.nextLine();

        System.out.println("Digite qual caractere vc quer substituir os espaços");
        char caractere = scanner.nextLine().charAt(0);

        System.out.println(input.replace(" ", Character.toString(caractere)));

    }
}