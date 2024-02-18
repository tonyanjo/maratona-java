package academy.devdojo.maratonajava.exercicios.calculadora.domain;

public class Usuario {
    private String nome;
    private int idade;
    private double velocidade;
    private double peso;
    private double minutosPercorridos;
    private double coeficienteDeCalculo = 0.0175;

    public void calcularCalorias() {
        if (this.idade <= 0 || this.velocidade <= 0 || this.peso <= 0) {
            System.out.println("Valores não podem ser zerados, insira um valor correto");
        } else {
            double caloria = (this.velocidade * this.peso * this.coeficienteDeCalculo) * this.minutosPercorridos;
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.println("Você correu a " + this.velocidade + "Km/h por " + this.minutosPercorridos + " minutos");
            System.out.println("Voce perdeu " + caloria + " calorias");
        }
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

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getMinutosPercorridos() {
        return minutosPercorridos;
    }

    public void setMinutosPercorridos(double minutosPercorridos) {
        this.minutosPercorridos = minutosPercorridos;
    }
}
