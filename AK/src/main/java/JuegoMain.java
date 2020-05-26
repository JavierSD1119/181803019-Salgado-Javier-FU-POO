public class JuegoMain 
{
    public static void main(String args[])
    {
        AK bronce=new AK();
        bronce.tipo="bronce";
        bronce.cargador=5;
        bronce.precision=75;
        bronce.velocidadRecarga=5;
        bronce.precio=1000;
        bronce.daño=10;
        bronce.velocidadDisparo=15;
        
        System.out.println(bronce.toString());
        
        AK plata=new AK();
        plata.tipo="plata";
        plata.cargador=8;
        plata.precision=70;
        plata.velocidadRecarga=4.5;
        plata.precio=2300;
        plata.daño=11;
        
        System.out.println(plata.toString());
        
        AK oro=new AK();
        oro.tipo="oro";
        oro.cargador=10;
        oro.precision=85;
        oro.velocidadRecarga=4.3;
        oro.precio=2500;
        oro.daño=13;
        
        System.out.println(oro.toString());
        
        AK diamante=new AK();
        diamante.tipo="diamante";
        diamante.cargador=20;
        diamante.precision=95;
        diamante.velocidadRecarga=3;
        diamante.precio=4000;
        diamante.daño=20;
        diamante.velocidadDisparo=9.4;
        
        System.out.println(diamante.toString());
        
        AK adamantium=new AK();
        adamantium.tipo="adamantium";
        adamantium.cargador=30;
        adamantium.precision=100;
        adamantium.velocidadRecarga=1;
        adamantium.precio=10000;
        adamantium.daño=27;
        adamantium.velocidadDisparo=8;
        
        System.out.println(adamantium.toString());
    }
}