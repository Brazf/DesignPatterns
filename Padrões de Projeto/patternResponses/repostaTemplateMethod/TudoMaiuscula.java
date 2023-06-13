package repostaTemplateMethod;

public class TudoMaiuscula extends ProcessadorTexto{

	@Override
	protected char[] extrairCaracteres(String texto) {
		return texto.toCharArray();
	}

	@Override
	protected char[] converterCaracteres(char[] caracteres) {
        char[] caracteresConvertidos = new char[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            caracteresConvertidos[i] = Character.toUpperCase(caracteres[i]);
        }
        return caracteresConvertidos;
    }

	@Override
	protected String juntarCaracteres(char[] caracteresConvertidos) {
        return new String(caracteresConvertidos);
    }


		
}
