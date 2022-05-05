package app;

import domain.Contrato;
import repository.ContratoRepository;
import services.GeradorArquivo;

public class SistemaAguaLuzGeracaoArquivo {

    public static void main(String[] args) {

        ContratoRepository repo = new ContratoRepository();
        Contrato contrato = repo.exibirContrato();

        //gerar o arquivo contendo os contratos
        GeradorArquivo geradorArquivo = new GeradorArquivo();
        geradorArquivo.csv(contrato);
        geradorArquivo.txt(contrato);
    }
}
