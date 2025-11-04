package src.model;

import java.util.List;

public class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private String codigo;
    private List<Aluno> alunos;

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(alunos.indexOf(aluno));
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos ) {
            System.out.println(aluno.getNome());
        }
    }


    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
