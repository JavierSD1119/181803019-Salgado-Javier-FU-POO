import java.util.*;

public class PersonaMayor 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad: ");
        edad=leer.nextInt();
        if(edad>=18)
        {
            System.out.println("Ya eres mayor de edad");
        }
        else
        {
            edad=18-edad;
            System.out.println("Aun te faltan " +edad+ " años para ser mayor de edad");
        }
    }
}