package tp3.condori_actividad_6;
import java.util.Scanner;
public class TP3Condori_Actividad_6 {
    public static void main(String[] args) {
        Scanner lector1 = new Scanner(System.in);
        int M = 0;
        int N = 1;
        do{

            System.out.println("Ingrese dos numeros positivos.");

            N = lector1.nextInt();

            M = lector1.nextInt();

            if(N >= M){

                System.out.println("N debe ser menor a M.");

            }

        }while ((M < N)||(N <= 0)||(M <= 0));

        System.out.println("Multiplos de " + N + ":");

        for (int contador = 1; contador <= M; contador ++){

            if(contador % N == 0){

                System.out.println(contador);

            }

        }
    }
    
}
