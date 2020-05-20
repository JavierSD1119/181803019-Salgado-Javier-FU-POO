public class TipoVariable 
{
    public static void main(String args[])
    {
        /*
        FUERTEMENTE TIPADO
            Debemos de declarar el tipo de variable que es y esta mantendra ese tipo
        
            No puede pasar a ser de otro tipo
        
            Castear: Convertir una variable de un tipo a otro
        */
        //Tipos numericos enteros
        int a=10, b=2;
        
        //Operaciones aritmenticas
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        //Tipos flotantes
        float pi1=3.14f;
        double pi2=3.14;
        
        //Cambios de variables
        boolean bandera=true;
        
        //Ingresar caracteres
        char letra='a';
        String palabra="Puedes poner un mensaje largo";
        
        System.out.println(palabra);
        
        //Concatenar
        System.out.println(palabra+ " y esta es una prueba de ello");
        
        System.out.println("Este es un valor de pi "+pi1);
        System.out.println("Este es el valor del circulo "+pi1);
        System.out.println(pi1+a +"Es el valor del circulo");
        System.out.println("Este es el valor del circulo "+pi1+a);
    }
}