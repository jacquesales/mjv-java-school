package services;

import domain.Cadastro;
import domain.Contrato;
import util.FormatadorUtil;

public class GerarNotificacao {

    public void mensagem(Contrato contrato) {

        StringBuilder sb = new StringBuilder();
        Cadastro cliente = contrato.getCadastro();
        String cpfFormatado = FormatadorUtil.formatarCpf(cliente.getCpf());
        
        sb.append(String.format("Senhor(a) %s, CPF de número %s. ",cliente.getNome(),cpfFormatado));
        sb.append(String.format("Informamos que conforme contrato com protocolo de número %d ",contrato.getProtocolo()));
        sb.append(String.format("está agendado para a data/hora %s %sh a instalação ",contrato.getData(),contrato.getHora()));
        sb.append(String.format("do serviço de %s com taxa de ",contrato.getTipoServico()));
        sb.append(String.format("valor R$ %s em sua residência localizada no endereço abaixo: \n ",contrato.getTipoServico().getValor()));

        sb.append("\nLogradouro: "  + contrato.getCadastro().getEndereco().getLogradouro() + ", " + contrato.getCadastro().getEndereco().getNumero());
        sb.append("\nComplemento: " + contrato.getCadastro().getEndereco().getComplemento());
        sb.append("\nBairro: "      + contrato.getCadastro().getEndereco().getBairro());
        sb.append("\nCidade: "      + contrato.getCadastro().getEndereco().getCidade());
        sb.append("\nCep: "         + contrato.getCadastro().getEndereco().getCep());

        System.out.println(sb);
    }
}
