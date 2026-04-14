package tp3.condori_actividad_3;
import java.util.Scanner;
public class TP3Condori_Actividad_3 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int c = teclado.nextInt();
        System.out.println("Contador de " + c + " a 1.");
        while (c >= 1){
           System.out.println(c);
           c = c - 1;
       }
    }
    
}
