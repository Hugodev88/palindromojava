package palindromo;
import java.text.Normalizer;

public class ValidadorPalindromo { 
    public static String validar(String texto) {
        String textoLimpo = Normalizer.normalize(texto, Normalizer.Form.NFD)
        .replaceAll("[\\p{InCombiningDiacriticalMarks}]", "")
        .replaceAll(" ", "")
        .toLowerCase();
        char[] arrayString = textoLimpo.toCharArray();
        
        int resultado = 0;
        String textoResultado = "";
        
        for (int i = 0 ; i < arrayString.length ; i++) {
            if (arrayString[i] == arrayString[arrayString.length - 1 - i]) {
                resultado++;
            }
        }

        if (resultado == arrayString.length) {
            textoResultado = "Seu texto é um palindromo";
        } else {
            textoResultado = "Seu texto não é um palindromo";
        }

        return textoResultado;
    }
}