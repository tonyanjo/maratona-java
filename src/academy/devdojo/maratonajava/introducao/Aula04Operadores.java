package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 / numero02;
        /*
        caso a divisão seja feita por dois int o resultado será um int
        ex:
        int numero01 = 5
        int numero02 = 2
        int resultado = numero01 / numero02
            resultado = 2

        caso a divisão seja feita por um int e um double, ou dois doubles aí o resultado pode ser decimal
        ex:
        int numero01 = 5
        double numero02 = 2
        double resultado = numero01 / numero02
               resultado = 2.5

        Importante lembrar que o tipo de saída tem que ser de acordo com o valor de saída
        ex:
        CERTO: int resultado = 2
        ERRADO: int resultado = 2.5
         */
        System.out.println(resultado);

        // Operador de Resto %
        int resto = 21 % 2;
        System.out.println(resto);

        // Operadores de comparação < > <= >= == != Resultado de Operadores de comparação sempre serão booleans (true or false)
        boolean isDezMaiorQueVinte = 10 > 20; // Maior Que
        boolean isDezMenorQueVinte = 10 < 20; // Menor Que
        boolean isDezIgualVinte = 10 == 20; // Comparador
        boolean isDezIgualDez = 10 == 10; // Comparador
        boolean isDezDiferenteDez = 10 != 10; // Diferença

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezIgualDez: " + isDezIgualDez);
        System.out.println("isDezDiferenteDez: " + isDezDiferenteDez);

        // Operadores Lógicos: && (and), || (or), ! (not)

        // Operador && (and)
        int idade = 32;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        // Operador || (or)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCopravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCopravel);

        // Operadores de atribuição: =, +=, -=, *=, /=, %=

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // 1
        contador++; // 2
        contador--; // 1
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(contador2++); // Executa primeiro a variável e depois a operação
        System.out.println(++contador2); // Executa primeiro a operação e depois a variável
    }
}
