public class Jogo {
    private Time timeA;
    private Time timeB;
    private int golsTimeA;
    private int golsTimeB;

    public void registrarResultado(int golsA, int golsB) {
        this.golsTimeA = golsA;
        this.golsTimeB = golsB;

        if (golsA > golsB) {
            timeA.adicionarPontos(3);
        } else if (golsB > golsA) {
            timeB.adicionarPontos(3);
        } else {
            timeA.adicionarPontos(1);
            timeB.adicionarPontos(1);
        }
    }


}