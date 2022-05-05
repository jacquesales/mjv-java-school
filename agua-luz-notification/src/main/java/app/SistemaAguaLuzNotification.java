package app;

import domain.Contrato;
import repository.ContratoTxtRepository;
import services.GeradorNotificacao;

public class SistemaAguaLuzNotification {

    public static void main(String[] args) {

        ContratoTxtRepository repo = new ContratoTxtRepository();
        Contrato contrato = repo.buscar();

        GeradorNotificacao gn = new GeradorNotificacao();
        gn.gerarMensagem(contrato);
    }
}
