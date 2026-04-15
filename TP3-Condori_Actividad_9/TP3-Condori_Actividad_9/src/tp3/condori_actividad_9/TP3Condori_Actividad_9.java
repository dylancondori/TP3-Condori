package tp3.condori_actividad_9;
import java.util.Scanner;
public class TP3Condori_Actividad_9 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Ingrese el numero base.");

        int a = n.nextInt();

        int b = 0;

        int c = 1;

        System.out.println("Ingrese el exponente");

        do{

            b = n.nextInt();

            if (b < 0){

                System.out.println("El exponente debe ser un numero positivo");

            }

        }while(b < 0);

        for (int d = 1; d <= b; d++){

            c = c * a;

        }

        System.out.println("El resultado de "+a+" elevado a la "+b+" es igual a "+c);
    }
    
}
