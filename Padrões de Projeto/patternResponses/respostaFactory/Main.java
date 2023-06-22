package respostaFactory;

public class Main {

	public static void main(String[] args) {
        // Simulação de jogador na Amazônia
        LocalizacaoFactory amazoniaFactory = new AmazoniaFactory();
        Inimigo inimigoDaAmazonia = amazoniaFactory.criarInimigo();
        inimigoDaAmazonia.atacar();

        // Simulação de jogador no Sertão
        LocalizacaoFactory sertaoFactory = new SertaoFactory();
        Inimigo inimigoDoSertao = sertaoFactory.criarInimigo();
        inimigoDoSertao.atacar();

        // Simulação de jogador no Rio de Janeiro
        LocalizacaoFactory rioDeJaneiroFactory = new RioDeJaneiroFactory();
        Inimigo inimigoDoRioDeJaneiro = rioDeJaneiroFactory.criarInimigo();
        inimigoDoRioDeJaneiro.atacar();
    }
}
