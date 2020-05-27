import java.util.*;

public class ImprimirNumero 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        int n,m,i;
        
        System.out.println("Ingresa un numero 'n' para iniciar la serie: ");
        n=leer.nextInt();
        System.out.println("Ingresa el numero hasta donde quieres que llegue la serie: ");
        m=leer.nextInt();
        for(i=n;i<=m;i++)
        {
            System.out.println(i);
        }
    }
}