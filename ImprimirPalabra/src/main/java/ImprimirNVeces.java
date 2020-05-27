import java.util.*;

public class ImprimirNVeces 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        int n,i;
        String palabra;
        
        System.out.println("Ingresa una palabra: ");
        palabra=leer.next();
        System.out.println("Ingresa el numero de veces que quieres que se repita: ");
        n=leer.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(i +" -> " +palabra);
        }
    }
}