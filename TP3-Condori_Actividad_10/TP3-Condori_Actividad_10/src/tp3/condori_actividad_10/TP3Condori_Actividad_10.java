package tp3.condori_actividad_10;
import java.util.Scanner;
public class TP3Condori_Actividad_10 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = 0;
        int c = 0;
        long d = 0;
        System.out.println("Ingrese el pago del primer mes");
        do{
            b = a.nextInt();
            if (b <= 0){
                System.out.println("Ingresar un valor mayor a 0");
            }
        }while (b <= 0);
        System.out.println("Ingrese por cuantos meses se pagara");
        do{
            c = a.nextInt();
            if (c <= 0){
                System.out.println("Ingresar un valor mayor a 0");
            }
        }while (c <= 0);
        d = d + b;
        for (int f = 2; f <= c; f++){
            b = b * 2;
            d = d + b;
        }
        System.out.println("El total a pagar seria "+d+" pesos");
    }
    
}
