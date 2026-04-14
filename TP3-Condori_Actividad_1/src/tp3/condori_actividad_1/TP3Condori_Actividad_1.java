package tp3.condori_actividad_1;
public class TP3Condori_Actividad_1 {
    public static void main(String[] args) {
        int c1 = 1;
        while(c1 <= 100){
            System.out.println("Contador de while = " + c1);
            c1++;
        }
        System.out.println("________________________");
        int c2 = 1;
        do {            
            System.out.println("contador de do = " + c2);
            c2++;
        }
        while (c2 <= 100);
        System.out.println("________________________");
        for(int c3 = 1; c3 <= 100; c3 ++){
            System.out.println("contador de for = " + c3);
        }
    }
    
}
