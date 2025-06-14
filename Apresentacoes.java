import java.util.List;

public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> apresentacoes;


    private Apresentacoes(){
        apresentacoes = new java.util.ArrayList<>();
    }

    public static Apresentacoes getInstance(){
        if(instance == null){
            synchronized (Apresentacoes.class){
                if(instance == null){
                    instance = new Apresentacoes();
                }
            }
        }
        return instance;
    }

    public void addApresentacao(Apresentacao apresentacao){
        apresentacoes.add(apresentacao);
    }
    public List<Apresentacao> getApresentacoes(){
        return apresentacoes;
    }
    public void listarNotaApresentacaoMaiorQueSete(){
      System.out.println("Projetos com nota final >= 7:");
       this.apresentacoes.stream()
        .filter(a -> a.getProjeto().getNotaFinal() >= 7)
        .forEach(a -> System.out.println("Projeto: " + a.getProjeto().toString()));
    }
}
