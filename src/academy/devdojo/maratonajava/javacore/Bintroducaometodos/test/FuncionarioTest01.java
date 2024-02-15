package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Bryan";
        funcionario01.idade = 33;
        funcionario01.salarios[0] = 4200;
        funcionario01.salarios[1] = 6000;
        funcionario01.salarios[2] = 9000;

        funcionario01.imprimeDadosFuncionario();
        System.out.println("---------------------");
        funcionario01.mediaSalarios();
    }
}
