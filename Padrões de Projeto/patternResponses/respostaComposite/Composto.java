package respostaComposite;

import java.util.ArrayList;
import java.util.List;

public class Composto implements Componente{

	private String nome;
    private List<Componente> partes;

    public Composto(String nome) {
        this.nome = nome;
        this.partes = new ArrayList<>();
    }

    public void addParte(Componente parte) {
        partes.add(parte);
    }

    public void removeParte(Componente parte) {
        partes.remove(parte);
    }

    public double getPeso() {
        double pesoTotal = 0.0;
        System.out.println("Somando agora o peso de " + nome);

        for (Componente parte : partes) {
            pesoTotal += parte.getPeso();
        }

        System.out.println("Peso total do " + nome + ": " + pesoTotal);
        return pesoTotal;
    }
}
