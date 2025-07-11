import java.util.Scanner;

public class SomaNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o número");
        int numero = scanner.nextInt();

        int soma = 0;
        int c = 1;


        while(c <= numero){
            soma = soma + c;  
            c++;
            System.out.println(c);

    }
    scanner.close();
    


        
    }
    
}
