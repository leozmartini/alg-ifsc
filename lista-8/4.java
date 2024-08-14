//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 4. Escreva um método chamado localizaMaior que receba um array de inteiros e retorne o maior valor do
        //array.

        System.out.println(localizaMaior(new int[] {1,2,3}));
    }

    static int localizaMaior(int[] inteiros) {
        int maiorValor = inteiros[0];
        for (int i = 1; i < inteiros.length; i++) {
            if (inteiros[i] > maiorValor) {
                maiorValor = inteiros[i];
            }
        }
        return maiorValor;
    }
}