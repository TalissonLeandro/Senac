public class Ex002 {

    public static void main(String [] args){

        //Dado os valores de 1 a 7, imprima se é dia útil ou final de semana, considerando 1 como domingo

        int dia = 1;

        switch(dia){

            case 1:
                case 7:
                System.out.println("Hoje é final de semana!");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            System.out.println("Hoje é dia de semana!");
            break;
            default:
            System.out.println("Digite um valor válido.");
            break;

            
        }

    }
    
}
