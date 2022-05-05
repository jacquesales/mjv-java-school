package domain;

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
    private String celular;
    private Endereco endereco;

}
