package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.setNome("Bryan");
        funcionario01.setIdade(33);
        funcionario01.setSalarios(new double[]{3000, 4000, 5000});

        funcionario01.imprimeDadosFuncionario();
        System.out.println("---------------------");
        funcionario01.mediaSalarios();
    }
}
