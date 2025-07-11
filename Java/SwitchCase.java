public class SwitchCase {
    
    public static void main(String[] args) {

        //Imprima o dia da semana considerando 1 como domingo

        int dia = 1;

        //Char, int, byte, short, enum, String

        switch(dia){
            default: 
                System.out.println("Digite um valor válido");
                break;
            case 1:
                 System.out.println("Hoje é domingo!");
            break;
                case 2:
                 System.out.println("Hoje é segunda!");
             break;
            case 3:
                 System.out.println("Hoje é Terça!");
            break;
            case 4:
                 System.out.println("Hoje é Quarta!");
            break;
            case 5:
                 System.out.println("Hoje é Quinta!");
            break;
            case 6:
                 System.out.println("Hoje é Sexta!");
            break;
            case 7:
                 System.out.println("Hoje é Sábado!");
            break;
        }

            char sexo = 'F';

            switch(sexo){
                case 'F':
                     System.out.println("Sexo Feminino");
                break;

                case 'M':
                    System.out.println("Sexo Masculino");
                break;

                default:
                     System.out.println("Digite um valor válido");
                 break;
            }


    }
}
