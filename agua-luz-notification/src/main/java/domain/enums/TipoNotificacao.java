package domain.enums;

public enum TipoNotificacao {

    SMS ("S"),
    WHATS ("W");

    private final String sigla;

    TipoNotificacao(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
