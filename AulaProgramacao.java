
public class AulaProgramacao 
{

    public static void main(String[] args)
    {
        AlunoProgramacao aluno1 = new AlunoProgramacao();
        aluno1.nome = "Nome 0";
        aluno1.escolaridade = "Ensino médio";
        aluno1.matricula = 1;
        aluno1.nota = 5.6;

        AlunoProgramacao aluno2 = new AlunoProgramacao("Nome 1", "Ensino fundamental", 19, 10.0);

        // Nome e matrícula do aluno1
        System.out.println(aluno1.nome);
        System.out.println(aluno1.matricula);
        
        System.out.println("--------------------");
        
        // Nome e matrícula do aluno2
        System.out.println(aluno2.nome);
        System.out.println(aluno2.matricula);
    }
}