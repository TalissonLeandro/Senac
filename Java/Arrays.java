public class Arrays {
    
   public static void main(String[] args) {
    
    //Arrays são considerados objetos em java
    int [] idades = new int[5];
    idades[0] = 55; //Os Arrays começam do 0
    idades[1] = 12;
    idades[2] = 67;
    idades[3] = 120;
    idades[4] = 76;

    System.out.println(idades[4]);

    for (int i = 0; i < idades.length; i++) {
      System.out.println(idades[i]);
      
    }


   }

}
