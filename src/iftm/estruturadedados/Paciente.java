package iftm.estruturadedados;

public class Paciente implements Comparable<Paciente> {

    private String nome;
    private String nascimento;
    private String sintoma;
    private String prioridade;

    public Paciente() {}
    
    /**
     * @param nome
     * @param nascimento
     * @param sintoma
     * @param prioridade
     */
    public Paciente(String nome, String nascimento, String sintoma, String prioridade) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.sintoma = sintoma;
        this.prioridade = prioridade;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return String return the sintoma
     */
    public String getSintoma() {
        return sintoma;
    }

    /**
     * @param sintoma the sintoma to set
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * @return String return the prioridade
     */
    public String getPrioridade() {
        return prioridade;
    }

    /**
     * @param prioridade the prioridade to set
     */
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }





    @Override
    public String toString() {
        return "P(" + nome + ", " + nascimento + ", " + sintoma + ", " + prioridade + ")";
    }

    @Override
    public int compareTo(Paciente o) {
        return this.prioridade.compareTo(o.getPrioridade());
    }

}
