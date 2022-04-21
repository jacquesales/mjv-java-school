import java.time.LocalDateTime;

public class SistemaGeradorMovimentacao {

    public static void main(String[] args) {

        Movimentacao mov1 = new Movimentacao();
        mov1.setDataHora(LocalDateTime.of(2022,4,16,12,30,45));
        mov1.setCpfCnpj("123.456.789-99");
        mov1.setNomeCliente("RAIMUNDO NONATO LOUREIRO CASTELO BRANCO");
        mov1.setValor(1275.48);
        mov1.setTipo(TipoMovimentacao.RECEITA);
        mov1.setEstorno(false);

        GeradorConteudo gc = new GeradorConteudo();
        String conteudoGerado = gc.gerar(mov1);

        GeradorArquivo ga = new GeradorArquivo();
        ga.escreverDisco(conteudoGerado);
    }
}
