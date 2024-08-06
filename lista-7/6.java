import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 5. Substituir Caracteres: Escreva um programa que substitua todos os espaços em uma string por um
        //caractere específico (por exemplo, ’-’). A string e o caractere devem ser fornecidos pelo usuário.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para contar as palavras");
        String input = scanner.nextLine();
        int contador = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                contador++;
            }
        }
 
        System.out.println(contador);
    }
}