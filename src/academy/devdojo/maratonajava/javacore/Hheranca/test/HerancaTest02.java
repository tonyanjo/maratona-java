package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização estático da superclasse é executado somente uma vez quando a JVM carregar a classe pai
    // 0.1 - Em caso de multiplas instâncias de Blocos de inicialização estático, serão executados na ordem em que aparecem
    // 1 - Bloco de inicialização estático da subclasse é executado somente uma vez quando a JVM carregar a classe filha
    // 1.1 - Em caso de multiplas instâncias de Blocos de inicialização NÃO-estático, serão executados na ordem em que aparecem
    // 2 - Alocado espaço em memória pro objeto da superclass
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passada
    // 4 - Bloco de inicializaçao da superclasse é executado na ordem em que aparece
    // 5 - Construtor é executado da super classe
    // 6 - Alocado espaço em memória pro objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passada
    // 8 - Bloco de inicializaçao da subclasse é executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }

}
