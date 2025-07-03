
//Importando a biblioteca Scanner para pergunta
import java.util.Scanner;

/*
 leitor.nextInt() → lê um número inteiro digitado.

leitor.nextLine() → lê uma linha de texto completa.

leitor.next() → lê apenas uma palavra (até espaço).
 */

public class pergunta {

    public static void main(String[] args) {

        //Criando o objeto Scanner

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Nome: " + nome);

        scanner.close();
        
    }
    
}