//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 2. Altere o metodo soma para que ele receba como parâmetro um array de inteiros e retorne a soma dos
        //valores no array.

        System.out.println(soma(new int[] {1,2,3}));
    }

    static int soma(int[] inteiros) {
        int retorno = 0;
        for (int i = 0; i < inteiros.length; i++) {
            retorno += inteiros[i];
        }
        return retorno;
    }
}