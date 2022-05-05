package services;

import domain.Cadastro;
import domain.Contrato;
import domain.Endereco;
import util.TextoUtil;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GeradorArquivo {

    public void csv(Contrato contrato) {
        StringBuilder sb = new StringBuilder();

        //a cada contrato é gerado uma linha no padrão csv
        Cadastro cad = contrato.getCadastro();
        Endereco end = contrato.getCadastro().getEndereco();
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

        System.out.println(sb);
        escreverArquivo("\\agua-luz-contratos.csv", sb.toString());
    }

    public void txt(Contrato contrato) {
        StringBuilder sb = new StringBuilder();

        //cada contrato é gerado obedecendo o layout padrão posicional
        Cadastro cad = contrato.getCadastro();
        Endereco end = contrato.getCadastro().getEndereco();
        
        String cpf = cad.getCpf().replaceAll("\\D", "");
        sb.append(TextoUtil.completarZeroEsquerda(Integer.valueOf(cpf), 11));
        sb.append(TextoUtil.ajustar(cad.getRg(),10));
        sb.append(TextoUtil.ajustar(cad.getNome(), 30));
        sb.append(TextoUtil.removerCaracteresEspeciais(cad.getCelular()));
        sb.append(TextoUtil.ajustar(end.getLogradouro(), 20));
        String num = TextoUtil.completarZeroEsquerda(Integer.valueOf(end.getNumero()), 6);
        sb.append(TextoUtil.ajustar(num, 6));
        sb.append(TextoUtil.ajustar(end.getComplemento(), 10));
        sb.append(TextoUtil.ajustar(end.getBairro(), 15));
        sb.append(TextoUtil.ajustar(end.getCidade(), 30));
        sb.append(TextoUtil.ajustar(end.getUf(), 2));
        sb.append(TextoUtil.ajustar(end.getCep().replaceAll("\\D", ""), 8));
        sb.append(end.getPais().getSigla());
        sb.append(TextoUtil.completarZeroEsquerda(contrato.getProtocolo(), 10));
        sb.append(TextoUtil.removerCaracteresEspeciais(contrato.getDataHora().toString()));
        sb.append(contrato.getTipoServico().getSigla());
        String valor = TextoUtil.removerCaracteresEspeciais(contrato.getValor().toString());
        sb.append(TextoUtil.completarZeroEsquerda(Long.valueOf(valor), 8));
        sb.append(contrato.getTipoNotificacao().name());


        System.out.println(sb.toString().toUpperCase());
        escreverArquivo("\\agua-luz-contratos.txt", sb.toString().toUpperCase());
    }

    //metodo encapsulado, só é executado quando o metodo publico acima é chamado
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
