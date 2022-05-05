package util;

public class TextoUtil {
    public static String removerCaracteresEspeciais(String texto) {
        return texto.replaceAll("\\D", "");
    }

    public static String delimitarCaracteres(String textoOriginal, int tamanhoMax) {
        String novoTexto = textoOriginal.substring(0, tamanhoMax);
        return novoTexto;
    }

    public static String completarAoFinal(String textoOriginal, int tamanhoMax) {
        String formato = "%-" + tamanhoMax + "s";
        String textoFormatado = String.format(formato, textoOriginal);
        return textoFormatado;
    }

    public static String completarZeroEsquerda(Number numero, int tamanhoMax) {
        String formato = "%0" + tamanhoMax + "d";
        String numeroFormatado = String.format(formato, numero);
        return numeroFormatado;
    }

    //1º completa com o tamanho de caracteres max que deve ter e depois delimita
    public static String ajustar(String textoOriginal, int tamanhoMax) {
        String textoAjustado = completarAoFinal(textoOriginal, tamanhoMax);
        textoAjustado = delimitarCaracteres(textoAjustado, tamanhoMax);
        return textoAjustado;
    }


}
