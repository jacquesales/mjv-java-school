package domain;

import domain.enums.TipoPais;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cadastro {

    private String cpf;
    private String rg;
    private String nome;
    private long celular;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private TipoPais pais;
}
