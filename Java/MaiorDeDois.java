public class MaiorDeDois {

    //Receba dois números e imprima o maior.

    public static void main(String [] args){
        int numero1 = 5;
        int numero2 = 6;

        if(numero1 < numero2){
            System.out.println("O Segundo número é maior");
        }else if(numero1 > numero2){
            System.out.println("O primeiro número é maior");
        }else if(numero1 == numero2){
            System.out.println("Os números são iguais");
        }else {
            System.out.println("Digite um valor válido");
        }
    }
    
}
