package tp3.condori_actividad_5;
import java.util.Scanner;
public class TP3Condori_Actividad_5 {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);

        Scanner b = new Scanner(System.in);

        int num1 = 0;

        int num2 = 0;

        int num3 = 0;

        System.out.println("Ingrese dos numeros (el primero debe ser menor al segundo.)");

        do{

            System.out.println("1er numero:");

            num1 = a.nextInt();

            System.out.println("2do numero:");

            num2 = b.nextInt();

            if ((num1 == num2)||(num1 > num2)){

                System.out.println("Ingrese devuelta los numeros(hubo un error de introduccion o igualdad de numeros)");

            }

        }while ((num1 == num2)||(num1 > num2));

            System.out.println("Numeros pares del " + num1 + " al " + num2 + ".");

            while(num1 < num2){

                num1++;

                num3 = num1 % 2;

                if (num3 == 0){

                    System.out.println(num1);

                }

            }
    }
    
}
