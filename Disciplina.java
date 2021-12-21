package lab2;



public class Disciplina {
    /**
     * variaveis criadas para execução do programa.
     */
    private int horas;
    private int nota;
    private double valorNota;
    private double[] somaNotas = new double[4];
    private String nomeDisciplina;
    private double mediaAri;

    /**
     * contrutor criado para gerar nome da disciplina.
     * @param nomeDisciplina nome da disciplina "p2".
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;

    }

    /**
     * metodo para resgatar o numero de horas.
     * @param horas horas dedicadas a estudo,"+=" usado para acrecentar e somar o número de horas.
     */
    public void cadastraHoras(int horas) {
        this.horas += horas;

    }

    /**
     *
     * @param nota ordem da nota: exp(primeira).
     * @param valorNota valor das notas: exp(7,0)
     */
    public void cadastraNota(int nota, double valorNota) {
        this.somaNotas[ nota-1] = valorNota;

/**
 * boolean classe primitiva responsavel pela confirmação da aprovação ou não do aluno.
 */
    } public boolean aprovado () {

        /**
         * cont: contaodr responsavel por pegar nota por nota e soma - las.
         */
        double cont = 0;
        for ( int i=0; i < somaNotas.length ;i ++ ) {
            cont += somaNotas[i];
        }

        /**
         * mediaAri, pega as notas somadas em cont e dividi o valor por 4 para assim se ter a média aritimética.
         */
        mediaAri = cont / 4;


        if (mediaAri >= 7) {
            return true;
        }
        return false;
    }

    /**
     *
     * @return retorna a saída desejada pelo professor :) .
     */
    public String toString () {
        return nomeDisciplina + " " + mediaAri + " " + horas + " " + "[" + somaNotas[0] + " , " + somaNotas[1] + " , " + somaNotas[2] + " , " + somaNotas[3] + "]";
    }
}
