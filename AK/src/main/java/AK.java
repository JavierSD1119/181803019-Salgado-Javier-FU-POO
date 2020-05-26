public class AK 
{
    //Atributos, caracteristicas o datso del objeto de manera general
    
    String tipo;
    int cargador;
    int precision;
    double velocidadRecarga;
    double precio;
    int daño;
    double velocidadDisparo;
    
    public void disparar()
    {
        System.out.println("Daño infligido: " +daño);
    }
    public void apuntar()
    {
        
    }
    public void cargar()
    {
        
    }

    @Override
    public String toString() {
        return "AK{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision 
                + ", velocidadRecarga=" + velocidadRecarga + ", precio=" + precio + ", da\u00f1o=" + daño + '}';
    }
    
    
}