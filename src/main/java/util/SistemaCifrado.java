package util;

public class SistemaCifrado {

    private static final int MIN_ASCII = 0;
    private static final int MAX_ASCII = 255;

    public static String cifrar(String mensajeOriginal) {
        String mensajeCifrado = "";
        int len = mensajeOriginal.length();
        for (int i = 0; i < len; i++) {
            char c = mensajeOriginal.charAt(i);
            int code = (int) c;
            code += 1;
            if (code > MAX_ASCII) {
                code = MIN_ASCII;
            }
            char nc = (char) code;
            mensajeCifrado += nc;
        }
        return mensajeCifrado;
    }

    public static String decifrar(String mensajeOriginal) {
        String mensajeCifrado = "";
        int len = mensajeOriginal.length();
        for (int i = 0; i < len; i++) {
            char c = mensajeOriginal.charAt(i);
            int code = (int) c;
            code -= 1;
            if (code < MIN_ASCII) {
                code = MAX_ASCII;
            }
            char nc = (char) code;
            mensajeCifrado += nc;
        }
        return mensajeCifrado;
    }

    public static void main(String[] args) {
        String textoenClaro = "¡?¡¿$#%&/()[]Ñ[]:_Arriba Alianza!";
        String textoCifrado = "";
        textoCifrado = cifrar(textoenClaro);
        System.out.println(textoCifrado);
        System.out.println(decifrar(textoCifrado));

    }
}
