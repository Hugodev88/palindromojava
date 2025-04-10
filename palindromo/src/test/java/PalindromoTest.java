import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import src.main.java.palindromo.ValidadorPalindromo;

public class PalindromoTest {

    @Test
    public void testPalindromo() {
        ValidadorPalindromo val = new ValidadorPalindromo();
        assertEquals("Seu texto é um palindromo", val.validar("téanae t"));
        assertEquals("Seu texto não é um palindromo", val.validar("brasil"));
    }
}