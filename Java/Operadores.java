public class Operadores {

    public static void main(String [] args){

        //maior, menor, igual, igualA20, diferente

        Boolean isDezMaiorQueVinte = 10 > 20;
        Boolean isDezMenorQueVinte = 10 < 20;
       // Boolean isDezIgualDez = 10 == 10;
        Boolean isDezIgualVinte = 10 == 20;
        Boolean isDezDiferenteDeVinte = 10 != 20;

         

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
       // System.out.println(isDezIgualDez);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteDeVinte);

        // && (AND) || (OR) !
        
        int idade = 35;
        float salario = 3500F;

        Boolean isDentroDaleiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        Boolean isDentroDaleiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaleiMaiorQueTrinta);
        System.out.println(isDentroDaleiMenorQueTrinta);

        double valorTotCc = 2000;
        double valorTotContaPoup = 10000;
        float valorPlaystation = 5000;

     boolean isPlaystationCincoCompravel = valorTotCc > valorPlaystation || valorTotContaPoup > valorPlaystation;

     System.out.println("É possível comprar o Playstation 5? " + isPlaystationCincoCompravel);

     
    
     // Operadores de atribuição: =, +=, -=, *=, /=, %=

     double bonus = 1800; // 1800
     bonus += 1000; //2800
     bonus -= 1000; //1800
     bonus *= 2; //3600
     bonus /= 2; //900
     bonus %= 2; //900

     System.out.println(bonus);

     // ++, -- 

     int contador = 0; 
     contador += 1;// contador = contador + 1
     contador++;// contador = contador + 1
     contador--;// contador = contador - 1
     ++contador; //primeiro executa 
     --contador;
     System.out.println(contador);


          // +  - / *

        int numero01 = 50;
        int numero02 = 30;
        double resultado = numero01 / (double) numero02;

        System.out.println(resultado);




        





    }
    
}
