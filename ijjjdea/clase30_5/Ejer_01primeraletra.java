public class Ejer_01primeraletra {
    public static void main (String []args){
        String[] palabras = { "pepe","jose","carlos","matias","eduardo","jesus"};
        char caracter = 'c';
        int contadorLetra = 0;
        for (String palabra: palabras){
            if(palabra.charAt(0) == caracter){
                contadorLetra++;
            }
        }
        System.out.println("La cantidad de palabras que comienza con la letra: "+ caracter + "es: " + contadorLetra);
    }
}
