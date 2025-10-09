package AtividadeQuatro;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;


    public Tarefa(String titulo, boolean concluida, String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
        this.descricao = descricao;
        this.concluida = concluida;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + pessoaResponsavel + '\'' +
                ", descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
