package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    public Funcionario() {
        salarios = new double[3];
    }

    public void imprimeDadosFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("Salário 1: " + this.salarios[0]);
        System.out.println("Salário 2: " + this.salarios[1]);
        System.out.println("Salário 3: " + this.salarios[2]);
    }

    public void mediaSalarios() {
        double somaSalarios = 0;
        for (double salarioMes : this.salarios) {
            somaSalarios += salarioMes;
        }
        double media = somaSalarios / this.salarios.length;
        System.out.println("Média salarial: " + media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
