public class GeradorConteudo {

    public String gerar (Movimentacao movimentacao) {

        StringBuilder sb = new StringBuilder();

        sb.append(movimentacao.getDataHora().toString().replace("-", ""));

        String cpf = movimentacao.getCpfCnpj().replaceAll("[^a-zA-Z0-9]", "");
        Long cpfLong = Long.valueOf(cpf);
        String cpfFormatado = String.format("%014d", cpfLong);
        sb.append(cpfFormatado);
        //exemplo anterior de um código mais sucinto:
        //sb.append(String.format("%014d", Long.valueOf(movimentacao.getCpfCnpj().replaceAll("[^a-zA-Z0-9]", ""))));

        String nome = movimentacao.getNomeCliente();
        
        if(nome.length() > 30)
            sb.append(movimentacao.getNomeCliente().substring(0,30));
        else {
            sb.append(String.format("%-30s", nome));
        }

        sb.append(String.format("%010d", Long.valueOf(movimentacao.getValor().toString().replaceAll("\\D", ""))));

        sb.append(movimentacao.getTipo().getsigla());

        if(movimentacao.getEstorno())
            sb.append(1);
        else {
            sb.append(0);
        }

        return sb.toString();
    }
}
