package lab2;

/**
 *variaveis criadas para resolução do problema.
 */
public class RegistroTempoOnline {
    private int tempoDisciplina;
    private int tempoUsado;
    private String nomeDisciplina;

    /**
     * construtor responsavel por gerar o nome da disciplina e o tempo online a partir do 0.
     * @param nomeDisciplina nome da disciplina cursada "prog2".
     * @param tempoDisciplina tempo online destinado a disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoDisciplina) {
        this.tempoDisciplina = tempoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.tempoUsado = 0;


    }

    /**
     * como o construtor de cima ficou sobrecarregado foi nescessário pra gerar o horário a se cumprir da disciplina, no caso (120 horas).
     * @param nomeDisciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoDisciplina = 120;
    }

    /**
     *
     * @param tempo tempo online, "+=" pois está adicionando mais tempo, já que ele está iniciando do 0.
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoUsado += tempo;
    }

    /**
     * se o tempo usado online na disciplina for maior ou igual ao recomendado, o aluno está no caminho certo, se não, é bom melhorar campeão.
     * @return
     */
    public boolean atingiuMetaTempoOnline() {
        if (tempoUsado >= tempoDisciplina) {
            return true;
        }
        return false;

    }

    /**
     *
     * @return retorna saída desejada pelo professor :) .
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoUsado + "/" + tempoDisciplina;
    }
}
