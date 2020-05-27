import java.util.*;

public class Horoscopos 
{
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresa tu fecha de nacimiento -> -> ->");
        System.out.println("Dia: ");
        int dia=leer.nextInt();
        System.out.println("Mes (numero): ");
        int mes=leer.nextInt();
        
        if(mes==1)
        {
            if(dia>=1 && dia<=20)
            {
                System.out.println("Capricornio");
            }
            else if(dia>=21 && dia<=31)
            {
                System.out.println("Acuario");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==2)
        {
            if(dia>=1 && dia<=19)
            {
                System.out.println("Acuario");
            }
            else if(dia>=20 && dia<=29)
            {
                System.out.println("Piscis");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==3)
        {
            if(dia>=1 && dia<=20)
            {
                System.out.println("Piscis");
            }
            else if(dia>=21 && dia<=31)
            {
                System.out.println("Aries");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==4)
        {
            if(dia>=1 && dia<=20)
            {
                System.out.println("Aries");
            }
            else if(dia>=21 && dia<=30)
            {
                System.out.println("Tauro");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==5)
        {
            if(dia>=1 && dia<=21)
            {
                System.out.println("Tauro");
            }
            else if(dia>=22 && dia<=31)
            {
                System.out.println("Géminis");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==6)
        {
            if(dia>=1 && dia<=21)
            {
                System.out.println("Géminis");
            }
            else if(dia>=22 && dia<=30)
            {
                System.out.println("Cáncer");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==7)
        {
            if(dia>=1 && dia<=23)
            {
                System.out.println("Cáncer");
            }
            else if(dia>=24 && dia<=31)
            {
                System.out.println("Leo");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==8)
        {
            if(dia>=1 && dia<=23)
            {
                System.out.println("Leo");
            }
            else if(dia>=24 && dia<=31)
            {
                System.out.println("Virgo");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==9)
        {
            if(dia>=1 && dia<=23)
            {
                System.out.println("Leo");
            }
            else if(dia>=24 && dia<=30)
            {
                System.out.println("Libra");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==10)
        {
            if(dia>=1 && dia<=23)
            {
                System.out.println("Libra");
            }
            else if(dia>=24 && dia<=31)
            {
                System.out.println("Escorpio");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==11)
        {
            if(dia>=1 && dia<=22)
            {
                System.out.println("Escorpio");
            }
            else if(dia>=23 && dia<=30)
            {
                System.out.println("Sagitario");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
        else if(mes==12)
        {
            if(dia>=1 && dia<=21)
            {
                System.out.println("Sagitario");
            }
            else if(dia>=22 && dia<=31)
            {
                System.out.println("Capricornio");
            }
            else
            {
                System.out.println("Esa fecha no existe");
            }
        }
    }
}