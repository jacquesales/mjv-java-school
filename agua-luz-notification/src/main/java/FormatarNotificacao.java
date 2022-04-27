import domain.Contrato;

public class FormatarNotificacao {

    public void mensagem(Contrato contrato) {

        StringBuilder sb = new StringBuilder();

        System.out.printf(("Senhor(a) %s, CPF de número %s. " +
                        "Informamos que conforme contrato com protocolo de " +
                        "número %d está agendado para a data/hora %s %sh a instalação " +
                        "do serviço de %s com taxa de valor R$ %s em sua residência " +
                        "localizada no endereço abaixo: \n"),
                        contrato.getCadastro().getNome(),
                        contrato.getCadastro().getCpf(),
                        contrato.getProtocolo(),
                        contrato.getData(),
                        contrato.getHora(),
                        contrato.getTipoServico(),
                        contrato.getTipoServico().valorServico(contrato.getTipoServico().getSigla()));

        sb.append("\nLogradouro: "  + contrato.getCadastro().getEndereco().getLogradouro() + ", " + contrato.getCadastro().getEndereco().getNumero());
        sb.append("\nComplemento: " + contrato.getCadastro().getEndereco().getComplemento());
        sb.append("\nBairro: "      + contrato.getCadastro().getEndereco().getBairro());
        sb.append("\nCidade: "      + contrato.getCadastro().getEndereco().getCidade());
        sb.append("\nCep: "         + contrato.getCadastro().getEndereco().getCep());

        System.out.println(sb);
    }
}
