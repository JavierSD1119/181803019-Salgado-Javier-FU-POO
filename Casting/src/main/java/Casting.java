/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MrAssassin99
 */
public class Casting 
{
    public static void main(String args[])
    {
        //Casting explicito
        short a=5;
        int b=20;
        
        a=(short)b;
        
        //Casting implicito
        float c=2.5f;
        double d=5.5;
        
        d=c;
        
        //¿Que pasa con los decimales cuando casteo de  flotante a double a entero?
        double pi=3.1416;
        int duda=(int)pi;
        
        System.out.println("El valor de duda es: " +duda);
        
        //Casting String
        String valor="20";
        int n=Integer.parseInt(valor);
        n=n+duda;
        
        System.out.println("El resultado es: " +n);
        
        //Ciclo for
        for(int i=0;i<10;i++)
        {
            System.out.println(i+ " ");
        }
        
        //Ciclo while
        int j=1;
        while(j<10)
        {
            System.out.println(j+ " ");
            j++;
        }
        
        //Ciclo do while
        int k=1;
        do
        {
            System.out.println(k+ " ");
        }while (k<10);
    }
}