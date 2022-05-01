package domain.enums;

public enum TipoServico {

    AGUA ("A", "Água", 137.21),
    LUZ ("L", "Energia", 132.15);

    private final String sigla;
    private final String nome;
    private final Double valor;

    TipoServico(String sigla, String nome, Double valor) {
        this.sigla = sigla;
        this.nome = nome;
        this.valor = valor;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        return valor;
    }
}
