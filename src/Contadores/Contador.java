package Contadores;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int parametroUm = terminal.nextInt();
        System.out.print("Digite o segundo número: ");
        int parametroDois = terminal.nextInt();

        try{
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }catch(){
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
    }
}
