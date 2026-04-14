package tp3.condori_actividad_4;
import java.util.Scanner;
public class TP3Condori_Actividad_4 {
    public static void main(String[] args) {
        int c = 0;
        int c2 = 0;
        Scanner t1 = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);
        do{
        System.out.println("Introduzca un numero:");
        c = t1.nextInt();
        System.out.println("Introduzca otro numero:");
        c2 = t2.nextInt();
        if (c == c2){
            System.out.println("Vuelva a ingresar los numeros(porque no vale numeros repetidos)");
        }
        }while(c == c2);
        if (c > c2){
            System.out.println(c2);
        }else{
            System.out.println(c);
        }
        do{
        if (c > c2){
            c2++;
            System.out.println(c2);
        }
        else{
            c++;
            System.out.println(c);
        }
        }while(c != c2);

    }
    
}
