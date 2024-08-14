//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 5. Escreva um método chamado contaVogais que receba uma string como parâmetro e retorne a quantidade
        //de vogais na string.

        System.out.println(contaVogais("brasil"));
    }

    static int contaVogais(String palavras) {
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int totalVogais = 0;
        for (int i = 0; i < palavras.length(); i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (palavras.charAt(i) == vogais[j]) {
                    totalVogais++;
                }
            }
        }
        return totalVogais;
    }
}