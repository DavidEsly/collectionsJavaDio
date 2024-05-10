package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> setAluno;

    public GerenciadorAlunos() {
        this.setAluno = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        setAluno.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        for(Aluno n : setAluno){
            if(n.getMatricula() == matricula){
                System.out.println(n.toString() + " removido");
                setAluno.remove(n);
                break;
            }
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(setAluno);
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> aluno = new TreeSet<>(new AlunosPorNota());
        aluno.addAll(setAluno);
        return aluno;
    }

    public Set<Aluno> exibirAlunos(){
        return setAluno;
    }

}
