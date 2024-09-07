
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

public class AnnosBisiestos {

    public static boolean evaluar(int anno) {
        if (anno <= 1582) {
            System.out.println("");

        } else {
            return anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0);
        }
        return false;        

    
    public static void main (String[] args ) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año:");
        int anno = lector.nextInt();

        boolean respuesta = evaluar(anno);
        System.out.println(respuesta);
    }

}
