//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 7. Escreva um metodo chamado inverteString que receba uma string como parâmetro e retorne a string
        //invertida.

        System.out.println(inverteString("brasil"));
    }

    static String inverteString(String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() -1; i >= 0; i--) {
            char caractere = palavra.charAt(i);
            palavraInvertida += Character.toString(caractere);
        }

        return palavraInvertida;
    }
}