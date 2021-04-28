package Exercício1;

import java.util.Date;


public class Aluno {
    private String nomeCompleto;
    private Date dataNasc;
    private String nomeFacul;
    private String nomeCurso;
    private Date dataIngresso;
    
    
    
    
    public void getInfo() {
        
        Date dataAtual = new Date();
        
        long meses = (dataAtual.getTime() - dataIngresso.getTime()) / (1000*60*60*24) / 30;
        
        Integer idade = dataAtual.getYear() - dataNasc.getYear();
        if(dataAtual.getMonth() < dataNasc.getMonth()){
            idade--;
        }if(dataAtual.getMonth() == dataNasc.getMonth()){
            if(dataAtual.getDate() < dataNasc.getDate()){
                idade--;
            }
        }
        
        
        System.out.println("Nome: "+nomeCompleto +
                "\nIdade: "+idade+
                "\nNome da faculdade: "+nomeFacul+
                "\nNome do curso: "+nomeCurso+
                "\nTempo de curso (meses): "+meses);
        
    }
    
    public void Aluno(String nome,Date data,String facul,String curso,Date ingresso){
        this.nomeCompleto = nome;
        this.dataNasc = data;
        this.nomeFacul = facul;
        this.nomeCurso = curso;
        this.dataIngresso = ingresso;
    }
}