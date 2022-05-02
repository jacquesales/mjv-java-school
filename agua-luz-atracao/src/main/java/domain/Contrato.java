package domain;

import domain.enums.TipoNotificacao;
import domain.enums.TipoServico;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@ToString
public class Contrato {

    private long protocolo;
    private LocalDate data;
    private LocalTime hora;
    private Double valor;
    private TipoServico tipoServico;
    private TipoNotificacao tipoNotificacao;
    private Cadastro cadastro;

    public void setProtocolo(long protocolo) {
        this.protocolo = protocolo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    //encapsulando o valor na definição de serviço do objeto
    public void setTipoServico(TipoServico tipoServico) {
        this.tipoServico = tipoServico;
        this.valor = tipoServico.getValor();
    }

    public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
