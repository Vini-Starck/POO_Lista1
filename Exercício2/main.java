package Exercício2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class main {
    public static void main(String[]args) throws ParseException{
        
        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date datahoraVoo = a.parse("20/03/2021 18:00");
        
        
        Voo voo = new Voo(1, datahoraVoo);
        
        
        System.out.println("\n==========");
        voo.ocupa(1);
        System.out.println("\n==========");
        voo.proximoLivre();
        System.out.println("\n==========");
        voo.verifica(50);
        System.out.println("\n==========");
        voo.vagas();
        System.out.println("\n==========");
        voo.getVoo();
        System.out.println("\n==========");
        voo.getData();
        
        
        
    }
}
