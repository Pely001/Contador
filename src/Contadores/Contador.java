package Contadores;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método contendo a lógica de contagem
            Contagem.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }
        
        terminal.close();
    }
}
