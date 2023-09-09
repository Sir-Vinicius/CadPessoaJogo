package strategy;

public class EstrategiaMaior implements Estrategia {
    @Override
    public int processar(int[] numeros) {
        int max = numeros[0];
        for (int num : numeros) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
