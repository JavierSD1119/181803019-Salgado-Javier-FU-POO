public class Tarjeta 
{
    //Atributos de cada tarjeta
    
    double credito;
    double pagoMensualidad;
    double tazaInteres;
    int puntosCompras;    

    @Override
    public String toString() {
        return "Tarjeta{" + "credito=" + credito + ", pagoMensualidad=" + pagoMensualidad 
                + ", tazaInteres=" + tazaInteres + ", puntosCompras=" + puntosCompras + '}';
    }   
}