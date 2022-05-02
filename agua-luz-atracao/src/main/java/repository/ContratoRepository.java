package repository;

import domain.Cadastro;
import domain.Contrato;
import domain.Endereco;
import domain.enums.TipoNotificacao;
import domain.enums.TipoPais;
import domain.enums.TipoServico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ContratoRepository {

    private List<Contrato> contratos = new ArrayList<>();

    //método que simula a listagem de contratos vindos do banco de dados
    public List<Contrato> listar() {
        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Anita Malfatti");
        endereco.setNumero("108");
        endereco.setComplemento("Casa 2");
        endereco.setBairro("Centro");
        endereco.setCidade("São Paulo");
        endereco.setUf("SP");
        endereco.setCep("01.311-260");
        endereco.setPais(TipoPais.BRASIL);

        Cadastro cadastro = new Cadastro();
        cadastro.setCpf("123.456.789-00");
        cadastro.setRg("12345678-9");
        cadastro.setNome("Maria Julia Santos");
        cadastro.setCelular(11991234567L);
        cadastro.setEndereco(endereco);

        Contrato contrato = new Contrato();
        contrato.setProtocolo(2022025687);
        contrato.setData(LocalDate.now());
        contrato.setHora(LocalTime.now());
        contrato.setTipoServico(TipoServico.AGUA);
        contrato.setTipoNotificacao(TipoNotificacao.SMS);
        contrato.setCadastro(cadastro);

        contratos.add(contrato);
        return contratos;
    }
}
