package Exercício3;

public class Empregado {
    private String nome;
    private String sobrenome;
    private Double salMes;
    
    public Empregado(String primeiroNome, String sobrenome, Double salario) {
        this.nome = primeiroNome;
        this.sobrenome = sobrenome;
        if(salario > 0){
            this.salMes = salario;
        } else {
            this.salMes = 0.0;
        }
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String primeiroNome) {
        this.nome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalario() {
        return salMes;
    }

    public void setSalario(Double salarioMensal) {
        if(salarioMensal > 0){
            this.salMes = salarioMensal;
        } else {
            this.salMes = 0.0;
        }
    }
    
    public void getInfo() {
        
        //Escreve no console as informações dos empregados
       
        System.out.println("\n\n=== Empregado sem bônus: ===");
        System.out.println("\n\nPrimeiro Nome: "+getNome());
        System.out.println("Sobrenome: "+getSobrenome());
        System.out.println("Salario : "+getSalario());
        System.out.println("==========================");
        
    
        System.out.println("\n\n===== Empregado com bônus: =====");
        System.out.println("\n\nPrimeiro Nome: "+getNome());
        System.out.println("Sobrenome: "+getSobrenome());
        System.out.println("Salario : "+(getSalario()+((getSalario()/100)*10)));
        System.out.println("==========================");
    }
}
