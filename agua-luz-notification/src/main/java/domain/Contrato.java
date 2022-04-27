package domain;

import domain.enums.TipoNotificacao;
import domain.enums.TipoServico;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Contrato {

    private long protocolo;
    private LocalDate data;
    private LocalTime hora;
    private Double valor;
    private TipoServico tipoServico;
    private TipoNotificacao tipoNotificacao;
    private Cadastro cadastro;
}
