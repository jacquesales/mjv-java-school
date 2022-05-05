package repository;

import domain.Cadastro;
import domain.Contrato;
import domain.Endereco;
import domain.enums.TipoNotificacao;
import domain.enums.TipoPais;
import domain.enums.TipoServico;
import java.time.LocalDateTime;

public class ContratoRepository {

    private Contrato contrato = new Contrato();

    //método que simula um contrato vindo do banco de dados
    public Contrato exibirContrato() {
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Sebastião Firmino");
        endereco.setNumero("123");
        endereco.setComplemento("AP 210 BL CENTAURO");
        endereco.setBairro("São Sebastião");
        endereco.setCidade("São Raimundo Nonato");
        endereco.setUf("Sp");
        endereco.setCep("07.210.715");
        endereco.setPais(TipoPais.BRASIL);

        Cadastro cadastro = new Cadastro();
        cadastro.setCpf("7.324.223.21");
        cadastro.setRg("33765-9");
        cadastro.setNome("Raimundo Nonato Loureiro Castelo Branco");
        cadastro.setCelular("(11) 99768-1515");
        cadastro.setEndereco(endereco);

        Contrato contrato = new Contrato();
        contrato.setProtocolo(1984365);
        contrato.setDataHora(LocalDateTime.of(2022,5,2,15,21));
        contrato.setTipoServico(TipoServico.AGUA);
        contrato.setTipoNotificacao(TipoNotificacao.SMS);
        contrato.setCadastro(cadastro);

        return contrato;
    }
}
