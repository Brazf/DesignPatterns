package respostaComposite;

public class Parte implements Componente{

	private String nome;
    private double peso;

    public Parte(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public double getPeso() {
        System.out.println("Somando agora o peso de " + nome + ": " + peso + ". Total parcial: " + peso);
        return peso;
    }
    
}
