import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        System.out.println("---------------RECONHECE PONTO FLUTUANTE---------------");

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("entradas/TestePontoflutuante.txt"));
            String line;
            while ((line = leitor.readLine()) != null) {
                if (ReconhecedorLiteralPontoFlutuante.reconhecerLiteralPontoFlutuante(line)) {
                    System.out.println("\nPonto flutuante válido: " + line);
                } else {
                    System.out.println("\nPonto flutuante inválido: " + line);
                }
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo.");
        } 

        System.out.println("\n---------------RECONHECE COMENTARIO VALIDO---------------");
        
        try {
            BufferedReader leitor = new BufferedReader(new FileReader("entradas/TesteComentarioValido.txt"));
            String line;

            while ((line = leitor.readLine()) != null) {
                if (ReconhecedorLiteralComentario.comentarioValido(line)) {
                    System.out.println("\nComentário válido: " + line);
                } else {
                    System.out.println("\nComentário inválido: " + line);
                }
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 

        System.out.println("\n---------------RECONHECE IDENTIFICADOR VALIDO---------------");

        try {
            BufferedReader leitor = new BufferedReader(new FileReader("entradas/TesteIdentificadorValido.txt"));
            String line;

            while ((line = leitor.readLine()) != null) {
                if (ReconhecedorLiteralIdentificadores.reconhecerIdentificadorJava(line)) {
                    System.out.println("\nIdentificador válido: " + line);
                } else {
                    System.out.println("\nIdentificador inválido: " + line);
                }
            }
            leitor.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}