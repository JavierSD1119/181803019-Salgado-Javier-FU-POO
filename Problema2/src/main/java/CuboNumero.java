import java.util.*;

public class CuboNumero 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresa un numero para calcular su cubo: ");
        double num=leer.nextDouble();
        
        System.out.println("El cubo de " +num+ " es : " +num*num*num);
    }
}