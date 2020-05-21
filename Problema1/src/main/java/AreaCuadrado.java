import java.util.*;

public class AreaCuadrado 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresa el lado 1: ");
        double l1=leer.nextDouble();
        System.out.println("Ingresa el lado 2: ");
        double l2=leer.nextDouble();
                
        System.out.println("El area del cuadrado es: "+l1*l2);
    }
}
