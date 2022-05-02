package domain.enums;

public enum TipoPais {

    BRASIL("BR"),
    CHILE ("CL"),
    ESTADOSUNIDOS ("US"),
    GRECIA ("GR");

    private final String sigla;

    TipoPais(String sigla) {
        this.sigla = sigla;
    }

    public String getsigla() {
        return sigla;
    }
}