import java.util.*;

public class NumeroMayor 
{
    public static void main(String args[])
    {
        int num1,num2;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        num1=leer.nextInt();
        System.out.println("Ingresa otro numero:");
        num2=leer.nextInt();
        if(num1>num2)
        {
            System.out.println(num1 +" es mayor a " +num2);
        }
        else
        {
            System.out.println(num2 +" es mayor a " +num1);
        }
    }
}