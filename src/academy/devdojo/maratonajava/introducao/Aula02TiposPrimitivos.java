package academy.devdojo.maratonajava.introducao;

/**
 * Convenção no <b>Java</b><br>
 * Usar CamelCase para nomes de <b>CLASSES</b> como Aula02TiposPrimitivos<br>
 * Usar camelCase para nomes de <b>VARIÁVEIS</b> e <b>MÉTODOS</b><br>
 */

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //Tipos primitivos: int, double, float, char, byte, short, long, boolean

        int idade = 10; // 4 bytes de memória | Valores: -2.147.483,648 até 2.147.483,647
        long numeroGrande = 100000; // 8 bytes de memória | Valores: -9.223.372.036.854.775,808 até 9.223.372.036.854.750,000
        double salarioDouble = 2000; // 8 bytes de memória | Valores: 1.7e-308 até 1.7e+038
        float salarioFloat = 2500; // 4 bytes de memória | Valores: 3.4e-038 até 3.4e+038
        byte idadeByte = 10; // 1 byte de memória | Valores: -128 até 127
        short idadeShort = 10; // 2 bytes de memória | Valores: -32768 até 32767
        boolean verdadeiro = true; // 1 bit de memória | Valores: true or false
        boolean falso = false; // 1 bit de memória | Valores: true or false
        char caractere = '\u0041'; // 2 bytes de memória | Valores: ASCII por padrão, mas roda unicode usando uma contrabarra + U antes do código
        String nome = "String é uma classe usam duas áspas e são do tipo Referencial, não primitivos";

        System.out.println("A idade é "+idade);
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println(nome);
    }
}
