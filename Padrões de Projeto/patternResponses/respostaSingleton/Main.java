package respostaSingleton;

public class Main {

	public static void main(String[] args) {

        // Utilização do arquivo de configuração
        ConfigureSingleton configuracao = ConfigureSingleton.getInstance();
        ConfigureSingleton configuracao2 = ConfigureSingleton.getInstance();
        
        System.out.println(configuracao);
        System.out.println(configuracao2);

        
    }
	
}
