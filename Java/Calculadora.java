import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String continuar;

        do {

        System.out.println("Bem vindo a sua calculadora!"+"\n"+"Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();




        System.out.println("Ecolha a operação: " + "\n" +"[1] - Multiplicação "+"\n"+"[2] - Adição "+"\n"+ "[3] - Divisão" + "\n" + "[4] - Substração");
        int operacao = scanner.nextInt();
        int total;

        switch(operacao){
            case 1:
            total = numero1 * numero2;

                System.out.println("O resultado da multiplicação foi:" + total);
            break;
                case 2:
                   total = numero1 + numero2;
             System.out.println("O resultado dda Adição dos números foi: " + total);
            break;
                case 3:
                total = numero1 / numero2;
                 System.out.println("O resultado da divisão dos números foi: " + total);
                break;
             case 4:
             if(numero2 > numero1){
               total = numero2 - numero1;
               System.out.println("O resultado da subtração foi: " + total);
             }else{
                total = numero1 - numero2;
                System.out.println("O resultado da subtração dos números foi: " + total);
             }
            break;

            default:
                System.out.println("Valor digitado inválido!");
            break;
        }

        System.out.println("Deseja continuar? [S]/[N]");
        scanner.nextLine();
        continuar = scanner.nextLine();
            
        } while (continuar.equalsIgnoreCase("s"));


        System.out.println("Obrigado por utilizar o nosso sistema! Calculadora finalizada!");

        scanner.close();

    


    }
    
}



