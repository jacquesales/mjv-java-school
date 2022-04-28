package util;

public class FormatadorUtil {

    public static String formatarCpf(String cpf) {
        String part1 = cpf.substring(0,3);
        String part2 = cpf.substring(4,7);
        String part3 = cpf.substring(8,11);
        String part4 = cpf.substring(12,14);
        return String.format("%s.%s.%s-%s", part1, part2, part3, part4);
    }
}
