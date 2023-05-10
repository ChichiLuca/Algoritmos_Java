
import java.util.*;
public class par_impar {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int Numero;
        System.out.println("Introducir numero entero:");
        Numero = sc.nextInt(); /* acá se introduce el entero*/
        if(Numero%2==0){ /*numeros pares son divisibles por 2 y el resto 0 */
            System.out.println("Par");
        }
    else{
            System.out.println("Impar");
            }
        }
}