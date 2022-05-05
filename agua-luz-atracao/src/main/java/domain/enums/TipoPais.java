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

    public String getSigla() {
        return sigla;
    }

    public static TipoPais getPaisPorSigla(String sigla) {
        for (TipoPais p: TipoPais.values()) { //array que representa todos os enums
            if(p.getSigla().equals(sigla))
                return p;
        }
        return null;
    }
}
