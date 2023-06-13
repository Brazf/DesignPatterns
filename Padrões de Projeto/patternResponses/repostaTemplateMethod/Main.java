package repostaTemplateMethod;

public class Main {

	    public static void main(String[] args) {
	        
	    	String entrada = "Exemplo de Texto";

	        ProcessadorTexto processadorMaiusculo = new TudoMaiuscula();
	        
	        String resultadoMaiusculo = processadorMaiusculo.converterTexto(entrada);
	        System.out.println("Texto em maiúsculo: " + resultadoMaiusculo);

	        ProcessadorTexto processadorMinusculo = new TudoMinuscula();
	        
	        String resultadoMinusculo = processadorMinusculo.converterTexto(entrada);
	        System.out.println("Texto em minúsculo: " + resultadoMinusculo);
	    
	    }

}
