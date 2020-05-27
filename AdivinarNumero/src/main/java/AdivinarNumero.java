import java.util.*;

public class AdivinarNumero 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        int num, aleatorio;
        aleatorio=(int)(Math.random()*100);
        
        System.out.println("Intenta adivinar el numero ...");
        System.out.println("Ingresa cualquiern numero entre 0 y 100:");
        num=leer.nextInt();
        do
            {
                if(num>aleatorio)
            {
                System.out.println("Menos...");
            }
            else
            {
                System.out.println("Más...");
            }
            num=leer.nextInt();
        }while(num!=aleatorio);
        System.out.println("Felicidades... Lo adivinaste");
    }
}