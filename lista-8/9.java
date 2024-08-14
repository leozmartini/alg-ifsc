import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 9. Escreva um método chamado fill que receba um array de inteiros e preencha o array com o valor
        //informado pelo usuário.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro para preencher a array");

        int[] arrayPreenchido = fill(new int[3], scanner.nextInt());

        System.out.print("{");
        for (int i = 0; i < arrayPreenchido.length; i++) {

            System.out.print(" " + arrayPreenchido[i] + ", ");

        }
        System.out.print("}");
    }

    static int[] fill(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            array[i] = valor;
        }
        return array;
    }
}