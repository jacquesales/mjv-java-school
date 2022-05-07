package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FormatadorUtilTest {

    @DisplayName("Testando o método de formatação de cep")
    @Test
    public void deveRetornarUmCepValido() {
        String parametro = "02300210";
        String resultado = FormatadorUtil.formatarCep(parametro);
        String expectativa = "02.300-210";

        Assertions.assertEquals(expectativa, resultado);
    }

    @DisplayName("Testando o método de formatação de cep")
    @Test
    public void deveTratarCepComMenosdeOitoDigitos() {
        String parametro = "1300210";
        String resultado = FormatadorUtil.formatarCep(parametro);
        String expectativa = "01.300-210";

        Assertions.assertEquals(expectativa, resultado);
    }
}
