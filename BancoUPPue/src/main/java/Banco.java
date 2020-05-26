public class Banco 
{
    public static void main(String args[])
    {
        Tarjeta docente=new Tarjeta();
        docente.credito=0;
        docente.pagoMensualidad=0;
        docente.tazaInteres=0;
        docente.puntosCompras=2;
        System.out.println(docente.toString());
        
        Tarjeta estudiante=new Tarjeta();
        estudiante.credito=0;
        estudiante.pagoMensualidad=0;
        estudiante.tazaInteres=0;
        estudiante.puntosCompras=3;
        System.out.println(estudiante.toString());
        
        Tarjeta morada=new Tarjeta();
        morada.credito=0;
        morada.pagoMensualidad=0;
        morada.tazaInteres=0;
        morada.puntosCompras=9;
        System.out.println(morada.toString());
        
        Tarjeta buhoEspecial=new Tarjeta();
        buhoEspecial.credito=0;
        buhoEspecial.pagoMensualidad=0;
        buhoEspecial.tazaInteres=0;
        buhoEspecial.puntosCompras=12;
        System.out.println(buhoEspecial.toString());
        
        Tarjeta buhoBlancoOro=new Tarjeta();
        buhoBlancoOro.credito=0;
        buhoBlancoOro.pagoMensualidad=0;
        buhoBlancoOro.tazaInteres=0;
        buhoBlancoOro.puntosCompras=15;
        System.out.println(buhoBlancoOro.toString());
    }
}