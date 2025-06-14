import java.util.List;
import java.util.ArrayList;

public class Equipe {
    private List<Estudante> membros;
    private String nome;
    private Projeto projeto;

    public Equipe() {
        this.membros = new ArrayList<>();
    }

    public Equipe(String nome) {
        this();
        this.nome = nome;
    }

    public void addMembro(Estudante estudante) {
        membros.add(estudante);
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estudante> getMembros() {
        return membros;
    }
}
