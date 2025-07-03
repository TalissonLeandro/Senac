import java.util.Scanner;

public class Ex001 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");

        int salario = scanner.nextInt();

        if(salario > 0 && salario < 34712){
            System.out.println("O imposto a ser pago será de 9%");
        }else if(salario > 3712 && salario < 68507){
            System.out.println("O imposto será de 37.35%");
        }else if(salario >= 68508){
            System.out.println("O imposto será de 49.50%");
        }else{
            System.out.println("Digite um valor válido");
        }



    }
    
}
