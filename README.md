# Construtores

Construtores são usados para executar um bloco de código no momento em que uma classe é instanciada, exemplo:

```java

public class Aluno 
{
    String nome;
    
    // Construtor aluno, espera receber o parâmetro nome no momento em que a classe for instanciada.
    public Aluno(String nome)
    {
        // O nome passado no momento da instanciação será atribuído a variável nome.
        this.nome = nome
    }
}

public class Inicio
{
    public static void main(String[] args)
    {
        // Momento em que a classe é instanciada, passando o nome do aluno.
        Aluno aluno1 = new Aluno("José");
    
        System.out.println("O nome do aluno é: " + aluno1.nome); 
        // A saída será: 
        // O nome do aluno é: José
    }
}
```
