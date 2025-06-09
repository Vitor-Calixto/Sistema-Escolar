package models;

public class Aluno {
    private String nome ;
    private String matricula;
    private int idade;
    private double notaFinal = 0.0;
   
   
    public Aluno(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.notaFinal = notaFinal; //Nota Inicial
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void  setNotaFinal(double notaFinal) {
        if (notaFinal >= 0.0 && notaFinal <= 10.0 ) {
    
    this.notaFinal = notaFinal;
        
    }else{
        System.out.println("ERROR! a nota deve estar entre 0.0 e 10.0");
    }
    
    
    }
       //MAIN  
       public void mostrarInfo(){
        System.out.println("Nome " + nome + " Idade " + idade + " Matricula" + matricula + " Nota Final " + notaFinal
        );

    
//   TESTE PRA VER SE O SISTEMA ACEITA


    


    

}}
//Aluno.java