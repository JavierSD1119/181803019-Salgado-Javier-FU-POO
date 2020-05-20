import java.util.Scanner;

public class LeerJava 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        String nombre=leer.nextLine();
        System.out.println("El nombre es: "+nombre);
        
        System.out.println("Dame un número: ");
        int numero=leer.nextInt();
        System.out.println("El numero leido es: "+numero);
        
        System.out.println("Ingresaa un numero double: ");
        double num=leer.nextDouble();
        System.out.println("El numero ingresado es: "+num);
        
    }
}