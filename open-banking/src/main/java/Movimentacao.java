import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Movimentacao {

    private LocalDateTime dataHora;
    private Double valor;
    private String cpfCnpj;
    private String nomeCliente;
    private Boolean estorno;
    private TipoMovimentacao tipo;

}
