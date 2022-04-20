import java.time.LocalDateTime;

public class GeradorArquivo {

    public static void main(String[] args) {

        Movimentacao mov1 = new Movimentacao();
        mov1.setDataHora(LocalDateTime.now());

        System.out.println(mov1.getDataHora());

    }
}
