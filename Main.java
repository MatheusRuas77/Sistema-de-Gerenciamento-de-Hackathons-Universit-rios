public class Main {
    public static void main(String[] args) {
        // obter instancias do singleton
        Equipes equipes = Equipes.getInstance();
        Apresentacoes apresentacoes = Apresentacoes.getInstance();

        // criar equipes
        Equipe equipe1 = new Equipe("Equipe 1");
        Equipe equipe2 = new Equipe("Equipe 2");

        // criar estudantes
        Estudante est1 = new Estudante();
        Estudante est2 = new Estudante();
        Estudante est3 = new Estudante();
        Estudante est4 = new Estudante();
        Estudante est5 = new Estudante();

        Estudante est6 = new Estudante();
        Estudante est7 = new Estudante();
        Estudante est8 = new Estudante();
        Estudante est9 = new Estudante();
        Estudante est10 = new Estudante();

        //vincular estudantes as equipes
        equipe1.addMembro(est1);
        equipe1.addMembro(est2);
        equipe1.addMembro(est3);
        equipe1.addMembro(est4);
        equipe1.addMembro(est5);

        equipe2.addMembro(est6);
        equipe2.addMembro(est7);
        equipe2.addMembro(est8);
        equipe2.addMembro(est9);
        equipe2.addMembro(est10);

        //adicionar equipes ao singleton
        equipes.addEquipe(equipe1);
        equipes.addEquipe(equipe2);

        System.out.println("Equipes criadas:");
        for (Equipe e : equipes.getEquipes()) {
            System.out.println("- " + e.getNome() + " com " + e.getMembros().size() + " membros");
        }

        //criar projetos
        Projeto projeto1 = new Projeto();
        Projeto projeto2 = new Projeto();

        //associar projetos as equipes
        equipe1.setProjeto(projeto1);
        equipe2.setProjeto(projeto2);

        System.out.println("Projetos associados às equipes.");

        //criar bancas
        Banca banca1 = new Banca();
        Banca banca2 = new Banca();

        //criar jurados
        Jurado jur1 = new Jurado();
        Jurado jur2 = new Jurado();
        Jurado jur3 = new Jurado();
        Jurado jur4 = new Jurado();

        Jurado jur5 = new Jurado();
        Jurado jur6 = new Jurado();
        Jurado jur7 = new Jurado();
        Jurado jur8 = new Jurado();

        //adicionar jurados as bancas
        banca1.addJurado(jur1);
        banca1.addJurado(jur2);
        banca1.addJurado(jur3);
        banca1.addJurado(jur4);

        banca2.addJurado(jur5);
        banca2.addJurado(jur6);
        banca2.addJurado(jur7);
        banca2.addJurado(jur8);

        System.out.println("Jurados adicionados às bancas.");

        //criar apresentacoes
        Apresentacao apresentacao1 = new Apresentacao();
        Apresentacao apresentacao2 = new Apresentacao();
        apresentacao1.setProjeto(projeto1);
        apresentacao1.setBanca(banca1);

        apresentacao2.setProjeto(projeto2);
        apresentacao2.setBanca(banca2);

        apresentacoes.addApresentacao(apresentacao1);
        apresentacoes.addApresentacao(apresentacao2);

        System.out.println("Apresentações criadas e adicionadas.");

        // Calcular notas dos jurados
        banca1.calcularNotaJurados();
        banca2.calcularNotaJurados();

        System.out.println("Notas dos jurados calculadas.");

double nota1 = banca1.CalcularNotaFinal();
double nota2 = banca2.CalcularNotaFinal();

projeto1.setNotaFinal(nota1);
projeto2.setNotaFinal(nota2);

System.out.println("Nota grupo 1: " + nota1);
System.out.println("Nota grupo 2: " + nota2);

apresentacoes.listarNotaApresentacaoMaiorQueSete();
}
}