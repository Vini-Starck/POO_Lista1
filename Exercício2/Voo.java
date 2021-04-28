package Exercício2;

import java.util.Date;


public class Voo {
    private int numVoo;
    private Date data;
    private boolean[] cadeira = new boolean[100];

    
    public Voo(int numVoo, Date datahora) {
        this.numVoo = numVoo;
        this.data = datahora;
    }
    
    
    public void proximoLivre(){
        int soma = 0;
        for(int i = 0; i < cadeira.length; i++){
            if(cadeira[i] == false){
                System.out.println("A próxima cadeira livre é: "+(i+1));
                break;
            }
        }
        
        for(int i = 0; i<cadeira.length; i++){
            if(cadeira[i] == true){
                soma++;
                if(soma == 100){
                    System.out.println("Voo lotado!");
                    break;
                }
            }
        }
    }
    public void verifica(int verifica){
        if(cadeira[verifica - 1]){
            System.out.println("Cadeira "+verifica+" ocupada!");
        }else{
            System.out.println("Cadeira "+verifica+" livre!");
        }
    }
    
    public void ocupa(int ocupa){
        if(cadeira[ocupa-1]){
            System.out.println("Erro! Vaga já ocupada.");
            
        }else{
            cadeira[ocupa-1] = true;
            System.out.println("Vaga ocupada com sucesso!"
                    + "\nCadeira: "+ocupa);
        }
    }
    
    public void vagas(){
        int soma = 0;
        for(int i = 0; i < cadeira.length; i++){
            if(cadeira[i]){
                soma++;
            }
        }
        System.out.println("Número de vagas disponíveis: "+(100-soma));
    }
    
    public void getVoo(){
        System.out.println("Número do voo: "+numVoo);
    }
    
    public void getData(){
        System.out.println("Data e horário do voo: "+data);
    }
}
