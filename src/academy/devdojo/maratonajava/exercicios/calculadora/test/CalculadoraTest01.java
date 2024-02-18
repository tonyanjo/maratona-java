package academy.devdojo.maratonajava.exercicios.calculadora.test;

import academy.devdojo.maratonajava.exercicios.calculadora.domain.Usuario;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Usuario usuario01 = new Usuario();
        usuario01.setNome("Tony");
        usuario01.setIdade(33);
        usuario01.setPeso(110);
        usuario01.setVelocidade(4.5);
        usuario01.setMinutosPercorridos(180);
        usuario01.calcularCalorias();
    }
}
