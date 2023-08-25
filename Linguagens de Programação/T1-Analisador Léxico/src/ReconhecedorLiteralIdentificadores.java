public class ReconhecedorLiteralIdentificadores {
    private static int estadoAtual;

    private static boolean isPalavraReservada(String palavra) {
        String[] palavrasReservadas = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
                "class", "const", "continue", "default", "do", "double", "else", "enum",
                "extends", "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native", "new", "package",
                "private", "protected", "public", "return", "short", "static", "strictfp",
                "super", "switch", "synchronized", "this", "throw", "throws", "transient",
                "try", "void", "volatile", "while" };

        for (String reservada : palavrasReservadas) {
            if (reservada.equals(palavra)) {
                return true;
            }
        }
        return false;
    }

    public static boolean reconhecerIdentificadorJava(String entrada) {
        estadoAtual = 0;

        for (char c : entrada.toCharArray()) {
            switch (estadoAtual) {
                case 0:
                    if (Character.isJavaIdentifierStart(c)) {
                        estadoAtual = 1;
                    } else {
                        return false;
                    }
                    break;
                case 1:
                    if (Character.isJavaIdentifierPart(c)) {
                        estadoAtual = 1;
                    }
                    break;
            }
        }
        if (estadoAtual == 1 && isPalavraReservada(entrada) == false) {
            return true;
        }
        return false;
    }
}
