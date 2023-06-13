package repostaTemplateMethod;

public abstract class ProcessadorTexto {

	public String converterTexto(String entrada) {
        
		char[] caracteres = extrairCaracteres(entrada);
        
        char[] caracteresConvertidos = converterCaracteres(caracteres);
        
        String resultado = juntarCaracteres(caracteresConvertidos);
        
        return resultado;
    
	}

    protected abstract char[] extrairCaracteres(String texto);

    protected abstract char[] converterCaracteres(char[] caracteres);

    protected abstract String juntarCaracteres(char[] caracteres);
    
    
	
}
