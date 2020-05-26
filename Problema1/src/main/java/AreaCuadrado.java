import java.util.*;

public class AreaCuadrado 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresa las medidadas de los lados: ");
        double lado=leer.nextDouble();
                
        System.out.println("El area del cuadrado es: "+lado*lado);
    }
}