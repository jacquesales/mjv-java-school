package repository;

import domain.Cadastro;
import domain.Contrato;
import domain.Endereco;
import domain.enums.TipoNotificacao;
import domain.enums.TipoPais;
import domain.enums.TipoServico;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContratoTxtRepository {

    Contrato contrato = new Contrato();

    public Contrato buscar() {
        //buscar conteudo que está no arquivo que o modulo atracao gerou
        //utilizar uma classe para ler arquivos
        //referenciar cada particula do arquivo para cada atributo do contarto e retorna-lo preenchido
        try {
            byte[] bytes = Files.readAllBytes(Paths.get("c:\\estudos\\agua-luz-output\\", "agua-luz-contratos.txt"));
            String conteudo = new String(bytes);
            System.out.println(conteudo);
            Cadastro cad = new Cadastro();
            Endereco end = new Endereco();
            cad.setCpf(conteudo.substring(0,11).trim());
            cad.setRg(conteudo.substring(11,21).trim());
            cad.setNome(conteudo.substring(21,51).trim());
            cad.setCelular(conteudo.substring(51,62).trim());
            end.setLogradouro(conteudo.substring(62,82).trim());
            end.setNumero(conteudo.substring(82,88).trim());
            end.setComplemento(conteudo.substring(88,98).trim());
            end.setBairro(conteudo.substring(98,113).trim());
            end.setCidade(conteudo.substring(113,143).trim());
            end.setUf(conteudo.substring(143,145).trim());
            end.setCep(conteudo.substring(145,153).trim());
            end.setPais(TipoPais.getPaisPorSigla(conteudo.substring(153,155).trim()));
            cad.setEndereco(end);
            contrato.setProtocolo(Long.valueOf(conteudo.substring(155,165).trim()));
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
            LocalDateTime dataHora = LocalDateTime.parse(conteudo.substring(165,177), dateFormatter);
            contrato.setDataHora(dataHora);
            contrato.setCadastro(cad);
            contrato.setTipoServico(TipoServico.getServicoPorSigla(conteudo.substring(177,178)));
            Double valor = Double.valueOf(conteudo.substring(178,186)) / 100;
            contrato.setValor(valor);
            contrato.setTipoNotificacao(TipoNotificacao.getNotificacaoPorSigla(conteudo.substring(186,187)));


            contrato.setCadastro(cad);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(contrato);
        return contrato;
    }
}
