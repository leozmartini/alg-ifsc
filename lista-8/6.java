//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 6. Escreva um método chamado contaCaracteres que receba uma string e um caractere como parâmetro e
        //retorne a quantidade de vezes que o caractere aparece na string.

        System.out.println(contaCaracteres("brasil", 'b'));
    }

    static int contaCaracteres(String palavras, char caractere) {
        int totalCaracteres = 0;
        for (int i = 0; i < palavras.length(); i++) {
            if (palavras.charAt(i) == caractere) {
                totalCaracteres++;
            }
        }
        return totalCaracteres;
    }
}