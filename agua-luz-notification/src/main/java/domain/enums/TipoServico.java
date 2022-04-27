package domain.enums;

public enum TipoServico {

    AGUA ("A"),
    LUZ ("L");

    private final String sigla;

    TipoServico(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
