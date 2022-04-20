public enum TipoMovimentacao {

    RECEITA ("R"),
    DESPESA ("D");

    private final String sigla;
    TipoMovimentacao (String sigla) {
        this.sigla = sigla;
    }

    public String getsigla() {
        return sigla;
    }
}
