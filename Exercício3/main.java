package Exercício3;

import java.text.ParseException;


public class main {
    public static void main (String [] args) throws ParseException {
        Empregado E1 = new Empregado("Vinicius","Starck",-20.0);
        E1.getInfo();
        
        
        Empregado E2 = new Empregado("Saulo","Figueredo",36000.0);
        E2.getInfo();
                             
    }
}