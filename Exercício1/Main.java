
package Exercício1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[]args) throws ParseException{
        Aluno vinicius = new Aluno();
        
        SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
        Date dataIngresso = a.parse("01/10/2019");
        Date dataNasc = a.parse("31/05/2001");
        
        
        vinicius.Aluno("Vinicius Starck Malghosian Cantafaro", dataNasc, 
        "Centro Universitário SENAC", "Sistemas de Informação", dataIngresso);
       
        vinicius.getInfo();
    }
}

