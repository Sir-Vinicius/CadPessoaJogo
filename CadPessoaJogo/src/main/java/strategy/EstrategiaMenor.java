package strategy;

public class EstrategiaMenor implements Estrategia {
    @Override
    public int processar(int[] numeros) {
        int min = numeros[0];
        for (int num : numeros) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
