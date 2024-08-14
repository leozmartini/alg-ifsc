//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 8. Escreva um método chamado ehPalindromo que receba uma string como parâmetro e verifique se a string
        //é um palíndromo. Utilize o método inverteString para auxilizar na verificação.

        System.out.println(ehPalindromo("aba"));
    }

    static boolean ehPalindromo(String palavra) {
        String palavraInvertida = "";
        for (int i = palavra.length() -1; i >= 0; i--) {
            char caractere = palavra.charAt(i);
            palavraInvertida += Character.toString(caractere);
        }

        return palavraInvertida.equals(palavra);
    }
}