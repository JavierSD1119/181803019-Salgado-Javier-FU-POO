import java.util.*;
import java.math.*;

public class Problema3 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        double d=0;
        
        System.out.println("Intgresa la primer coordenada 'x' : ");
        double x1=leer.nextDouble();
        System.out.println("Intgresa la primer coordenada 'y' : ");
        double y1=leer.nextDouble();
        
        System.out.println("Intgresa la segunda coordenada 'x' : ");
        double x2=leer.nextDouble();
        System.out.println("Intgresa la segunda coordenada 'y' : ");
        double y2=leer.nextDouble();
        
        d=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        
        System.out.println("La distancia entre los dos puntos es : " +d);
    }
}