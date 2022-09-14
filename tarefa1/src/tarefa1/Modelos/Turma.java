package tarefa1.Modelos;

import java.util.Objects;

public class Turma {
    private String codigo;
    private String nome;
    private Aluno alunos[];

    public Turma(){

    }
    public Turma(String codigo, String nome, Aluno alunos[]){
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = alunos;
    }


    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

}
