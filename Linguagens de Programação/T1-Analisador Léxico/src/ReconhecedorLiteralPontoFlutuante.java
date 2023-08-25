public class ReconhecedorLiteralPontoFlutuante {
    private static int estadoAtual;

    public static boolean reconhecerLiteralPontoFlutuante(String entrada) {
        estadoAtual = 0; // inicia em q0
        for (int i = 0; i < entrada.length(); i++) {
            char caractere = entrada.charAt(i);
            transicao(caractere);
        }
        return estadoAtual == 1; // Estado FINAL q1
    }

    private static void transicao(char caractere) {
        switch (estadoAtual) {
            case 0:
                if (Character.isDigit(caractere) || caractere == ',') {
                    estadoAtual = 0;
                } else if (caractere == '.') {
                    estadoAtual = 1; // Passa para q1
                }
                break;
            case 1:
                if (Character.isDigit(caractere) || caractere == ',') {
                    estadoAtual = 1;
                }
                break;
        }
    }
}
