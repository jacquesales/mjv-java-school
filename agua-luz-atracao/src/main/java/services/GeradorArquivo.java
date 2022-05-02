package services;

import domain.Cadastro;
import domain.Contrato;
import domain.Endereco;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GeradorArquivo {

    public void csv(List<Contrato> contratos) {
        StringBuilder sb = new StringBuilder();

        //a cada contrato é gerado uma linha no padrão csv
        for (Contrato c: contratos) {
            Cadastro cad = c.getCadastro();
            Endereco end = c.getCadastro().getEndereco();
            sb.append(cad.getCpf() + ";");
            sb.append(cad.getRg() + ";");
            sb.append(cad.getNome() + ";");
            sb.append(cad.getCelular() + ";");
            sb.append(end.getLogradouro() + ";");
            sb.append(end.getNumero() + ";");
            sb.append(end.getComplemento() + ";");
            sb.append(end.getBairro() + ";");
            sb.append(end.getCidade() + ";");
            sb.append(end.getUf() + ";");
            sb.append(end.getCep() + ";");
            sb.append(end.getPais() + ";");
        }
        System.out.println(sb);
        escreverArquivo("\\agua-luz-contratos.csv", sb.toString());
    }

    public void txt(List<Contrato> contratos) {
        StringBuilder sb = new StringBuilder();

        //cada contrato é gerado obedecendo o layout padrão posicional
        for (Contrato c: contratos) {
            Cadastro cad = c.getCadastro();
            Endereco end = c.getCadastro().getEndereco();
            sb.append(cad.getCpf());
            sb.append(cad.getRg());
            sb.append(cad.getNome());
            sb.append(cad.getCelular());
            sb.append(end.getLogradouro());
            sb.append(end.getNumero());
            sb.append(end.getComplemento());
            sb.append(end.getBairro());
            sb.append(end.getCidade());
            sb.append(end.getUf());
            sb.append(end.getCep());
            sb.append(end.getPais());
        }
        System.out.println(sb);
        escreverArquivo("\\agua-luz-contratos.txt", sb.toString());
    }

    private void escreverArquivo(String nomeArquivo, String conteudo) {
        File diretorio = new File("c:\\estudos\\agua-luz-output\\");
        if (! diretorio.exists())
            diretorio.mkdirs();
        try {
            Path path = Paths.get(diretorio.getAbsolutePath() + nomeArquivo);
            Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
