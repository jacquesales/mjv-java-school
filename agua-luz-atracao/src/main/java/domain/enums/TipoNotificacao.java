package domain.enums;

public enum TipoNotificacao {

    SMS("S"),
    WHATS("W");

    private final String sigla;

    TipoNotificacao(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public static TipoNotificacao getNotificacaoPorSigla(String sigla) {
        for (TipoNotificacao n : TipoNotificacao.values()) { //array que representa todos os enums
            if (n.getSigla().equals(sigla))
                return n;
        }
        return null;
    }
}
