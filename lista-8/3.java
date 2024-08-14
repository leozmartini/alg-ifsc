//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 3. Escreva um método chamado calculaMedia que retorne a média dos valores em um array de inteiros.

        System.out.println(media(new int[] {1,2,3}));
    }

    static double media(int[] inteiros) {
        double retorno = 0;
        for (int i = 0; i < inteiros.length; i++) {
            retorno += inteiros[i];
        }
        return retorno / inteiros.length;
    }
}