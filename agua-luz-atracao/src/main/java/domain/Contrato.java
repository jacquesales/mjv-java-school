package domain;

import domain.enums.TipoNotificacao;
import domain.enums.TipoServico;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Contrato {

    private long protocolo;
    private LocalDateTime dataHora;
    private Double valor;
    private TipoServico tipoServico;
    private TipoNotificacao tipoNotificacao;
    private Cadastro cadastro;

    public void setProtocolo(long protocolo) {
        this.protocolo = protocolo;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    //encapsulando o valor na definição de serviço do objeto
    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
        this.valor = tipoServico.getValor();
    }

    //precisa setar para retornar do banco de dados
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
