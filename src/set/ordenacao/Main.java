package set.ordenacao;

public class Main {

    public static void main(String[] args) {
        GerenciadorAlunos al = new GerenciadorAlunos();
        al.adicionarAluno("David",5447L,7.5);
        al.adicionarAluno("David",5447L,7.5);
        al.adicionarAluno("Bruce",5448L,8.5);
        al.adicionarAluno("Ana",5449L,8.5);
        al.adicionarAluno("Gabi",5440L,9.5);
        al.adicionarAluno("Darth",5446L,3.5);


        System.out.println(al.exibirAlunosPorNome());

        System.out.println(al.exibirAlunosPorNota());

        System.out.println(al.exibirAlunos());

        al.removerAluno(5449L);
        al.removerAluno(5447L);

        System.out.println(al.exibirAlunos());
    }



}
