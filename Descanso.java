package lab2;

public class Descanso {
    private int valor;
    private int semanas;

    /**
     * construtor responsavel por gerar o número de horas e semanas.
     */
    public Descanso() {
        this.semanas = 0;
        this.valor = 0;
    }

    /**
     * @param valor horas de descanso do aluno.
     */
    public void defineHorasDescanso(int valor) {
        this.valor = valor;

    }

    /**
     * @param valor o numero de semanas.
     */
    public void defineNumeroSemanas(int valor) {
        this.semanas = valor;

    }

    /**
     * @return a situação a respeito do descanso do aluno.
     */
    public String getStatusGeral() {
        if (this.semanas > 0) {
            if ((this.valor / this.semanas) < 26 || this.semanas == 0) {
                return "cansado";
            } else {
                return "descansado";
            }
        }
        return "cansado";
    }
}
