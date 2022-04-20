import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movimentacao {

    private LocalDateTime dataHora;
    private BigDecimal valor;
    private String cpfCnpj;
    private String nomeCliente;
    private Boolean estorno;
    private TipoMovimentacao tipo;

}
