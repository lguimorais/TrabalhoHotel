import java.util.Scanner;

public class entrada {
     private static Scanner scanf = new Scanner(System.in);
     public static int lerInteiros(String mensagem){

         System.out.println(mensagem);
         while (!scanf.hasNextInt()){
             System.out.println("entrada invalida");
            scanf.next();
         }
         return scanf.nextInt();
     }
    public static String lerTextos(String mensagem){

        System.out.println(mensagem);
        while (!scanf.hasNextLine()){
            System.out.println("entrada invalida");
            scanf.next();
        }
        return scanf.nextLine();
    }
    public static double lerDouble(String mensagem){
         System.out.println(mensagem);
         while (!scanf.hasNextDouble()){
             System.out.println("entrada invalida");
             scanf.next();
         }
         return scanf.nextDouble();
    }
}
