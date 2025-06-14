import java.util.List;

public class Equipes {
    private static Equipes instance;
    private List<Equipe> equipes;

    private Equipes(){
        equipes = new java.util.ArrayList<>();
    }

    public static Equipes getInstance(){
        if(instance == null){
            synchronized (Equipes.class){
                if(instance == null){
                    instance = new Equipes();
                }
            }
        }
        return instance;
    }
    public void addEquipe(Equipe equipe){
        equipes.add(equipe);
    }
    public List<Equipe> getEquipes(){
        return equipes;
    }

}
