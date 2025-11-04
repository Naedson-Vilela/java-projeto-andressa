package src.app;

import src.model.Pessoa;
import src.model.Regular;
import src.model.Aluno;
import src.model.Bolsista;
import src.model.Disciplina;

public class main {

    public static void main(String[] args) {
        Pessoa aluno = new Aluno();
        aluno.setNome("Naedson Davi");
        aluno.setCpf("123.123.123-12");
        aluno.setIdade(18);


        Disciplina disciplina = new Disciplina();
        disciplina.setNome("Matemática");
        disciplina.setCodigo("123");
        disciplina.setSemestre("Primeiro");
        

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Idade: " + aluno.getIdade());
        
        System.out.println("-==-=---=--=--=--=-=-=--=--==-=---=--=--=--=-=-=--=--==-=---=--=--=--=-=-=--=-");

        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Semestre: " + disciplina.getSemestre());
        System.out.println("Cód: " + disciplina.getCodigo());



        Bolsista bolsista = new Bolsista();
        bolsista.setNome("Naedson Bolsista");
        bolsista.setMatricula("123123-0");

        System.out.println(bolsista.getNome() + " - " + bolsista.getMatricula());
        bolsista.pagarMensalidade();

        Regular regular = new Regular();
        regular.setNome("Andressa Regular");
        regular.setIdade(68);
        regular.setMatricula("112112-0");

        System.out.println(regular.getNome() + " - " + regular.getMatricula() + "Idade:" + regular.getIdade());
        regular.pagarMensalidade();

        regular.fazerAniversario();
        System.out.println("Depois do aniversário: " + regular.getIdade());


    }
}