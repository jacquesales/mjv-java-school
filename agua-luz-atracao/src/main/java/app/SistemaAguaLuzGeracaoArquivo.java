package app;

import domain.Contrato;
import repository.ContratoRepository;
import services.GeradorArquivo;
import java.util.List;

public class SistemaAguaLuzGeracaoArquivo {

    public static void main(String[] args) {

        ContratoRepository repo = new ContratoRepository();
        List<Contrato> contratos = repo.listar();

        //gerar o arquivo contendo os contratos
        GeradorArquivo geradorArquivo = new GeradorArquivo();
        geradorArquivo.csv(contratos);
        geradorArquivo.txt(contratos);
    }
}
