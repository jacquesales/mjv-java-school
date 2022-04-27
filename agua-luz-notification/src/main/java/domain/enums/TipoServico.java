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

    public double valorServico(String sigla) {
        if (sigla == "A") {
            return 137.21;
        } else {
            return 132.15;
        }
    }
}
