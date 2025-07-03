public class ParImpar {

    public static void main (String [] args){

        //Peça um número ao usuário e diga se ele é par ou ímpar.

        int numero = 5;
        int parImpar = numero/2;

        if(parImpar == 0){
            System.out.println("O número é par!");
        }else if(parImpar >= 1){
            System.out.println("O número é impar!");
        }else{
            System.out.println("Digite um valor válido.");
        }

    }
    
}
