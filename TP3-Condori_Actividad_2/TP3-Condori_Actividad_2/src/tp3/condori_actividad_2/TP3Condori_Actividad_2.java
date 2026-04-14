package tp3.condori_actividad_2;
import java.util.Scanner;
public class TP3Condori_Actividad_2 {
    public static void main(String[] args) {
        Scanner mensaje = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = mensaje.nextInt();
        int c1 = 1;
        while(c1 <= num){
            System.out.println("Contador de while= " + c1);
            c1++;
        }
        System.out.println("___________________________");
        int c2 = 1;
        do {            
            System.out.println("contador de do while= " + c2);
            c2++;
        } 
        while (c2 <= num);
        System.out.println("___________________________");
        for(int c = 1; c <= num; c ++){
            System.out.println("contador de for = " + c);
        }
    }
    
}
