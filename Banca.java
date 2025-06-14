import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Banca() {
        jurados = new HashMap<>();
    }

    public void addJurado(Jurado jurado) {
        jurados.put(jurado, 0);
    }

    public void calcularNotaJurados() {
        Random rand = new Random();
        for (Jurado jurado : jurados.keySet()) {
            int nota = rand.nextInt(11); // notas de 0 a 10
            jurado.setNotaDada(nota);
            jurados.put(jurado, nota);
        }
    }

    public double CalcularNotaFinal() {
        int tamanho = jurados.size();
        if (tamanho == 0) {
            System.out.println("Nao ha jurados");
            return -1;
        }
        int soma = 0;
        for (int nota : jurados.values()) {
            soma += nota;
        }
        return (double) soma / tamanho;
    }
}
