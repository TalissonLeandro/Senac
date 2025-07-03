public class Aula05EstruturasCondicionais {

    public static void main(String [] args){

        int idade = 10;

        if(idade >= 18){
            System.out.println("Pode comprar bebida alcóolica");
        }

        //Sintaxe Operador ternário -> String teste = condição ? verdadeiro : falso;


        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado;

        resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
    
}
