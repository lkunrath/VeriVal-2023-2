public class ReconhecedorLiteralComentario {
    private static int estadoAtual;

    public static boolean comentarioValido(String entrada) {
        estadoAtual = 0; // Começamos no estado q0

        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            transicao(caractere);
        }
        return estadoAtual == 4; // estado Final
    }

    private static void transicao(char caractere) {
        switch (estadoAtual) {
            case 0:
                if (caractere == '/') {
                    estadoAtual = 1; // Muda para q1 quando encontra '/'
                }
                break;

            case 1:
                if (Character.isDigit(caractere) || caractere == '*') {
                    estadoAtual = 2; // Muda para q2 quando encontra '*'
                }
                break;

            case 2:
                if (Character.isLetterOrDigit(caractere) || Character.isWhitespace(caractere)) {

                } else if (Character.isDigit(caractere) || caractere == '*') {
                    estadoAtual = 3; // Muda para q3 quando encontra '*'
                }
                break;

            case 3:
                if (Character.isLetterOrDigit(caractere) || Character.isWhitespace(caractere)) {
                    estadoAtual = 2; // Voltamos para o estado q2 quando encontramos letras, dígitos ou
                                     // espaços em branco
                } else if (caractere == '/') {
                    estadoAtual = 4; // Muda para q4 quando encontra '/'
                }
                break;

            case 4:
                break;
        }
    }
}
