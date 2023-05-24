public class main  compra {

    public static void main (String[]args){
        double compra, descuento, total=0;
        compra=410;
        descuento=compra*0.2;
        total=compra;
        if(compra<300){
            total=compra-descuento;
            System.out.printin( "El descuento es de: "+descuento);
            System.out.printIn( "El total a pagar es: "+total);
        }else {
            System.out.printIin( "Sin descuentos, el total es:"+total);
        }

    }
}
