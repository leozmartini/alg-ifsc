import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 11. Escreva um método chamado localizaMeio para exibir o caractere do meio de uma string. Se o compri-
        //mento da string for ímpar, haverá dois caracteres do meio. Se o comprimento da string for par, haverá um
        //caractere do meio.

        System.out.println(localizaMeio("teste2"));
    }

    static char[] localizaMeio(String string) {
        if (string.length() % 2 == 1) {
            int meio = string.length() / 2;
            return new char[] {string.charAt(meio)};
        } else {
            return new char[] {string.charAt(string.length()/2-1), string.charAt(string.length()/2)};
        }
    }
}