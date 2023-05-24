public class main DoubleFloatC{ // estilo lenguaje c++

    public static void main(String[] args) {
        dobule num= 2.2; //double num= 2.2f; es float,ok
                         //float num=2.2;es double, ilegal
                         //float tiene 32bits y double 64 no hay problema
                        //de double(64) a float (32) si hay diferencia en el tamaño
        System.out.println("Numero: %f \n"); //seria: double = 2.2f
    }
}