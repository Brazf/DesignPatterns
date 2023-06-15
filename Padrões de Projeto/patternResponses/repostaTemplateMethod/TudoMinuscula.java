package repostaTemplateMethod;

public class TudoMinuscula extends ProcessadorTexto{

    @Override
    protected char[] converterCaracteres(char[] caracteres) {
        char[] caracteresConvertidos = new char[caracteres.length];
        for (int i = 0; i < caracteres.length; i++) {
            caracteresConvertidos[i] = Character.toLowerCase(caracteres[i]);
        }
        return caracteresConvertidos;
    }
		
}
