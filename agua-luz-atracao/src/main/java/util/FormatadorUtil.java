package util;

public class FormatadorUtil {

    public static String formatarCpf(String cpf) {
        String part1 = cpf.substring(0,3);
        String part2 = cpf.substring(3,6);
        String part3 = cpf.substring(6,9);
        String part4 = cpf.substring(9,11);
        return String.format("%s.%s.%s-%s", part1, part2, part3, part4);
    }

    public static String formatarCep(String cep) {
        cep = String.format("%08d", Long.valueOf(cep));

        String b1 = cep.substring(0,2);
        String b2 = cep.substring(2,5);
        String b3 = cep.substring(5,8);
        return b1+ "." +b2+ "-" +b3;
    }
}
