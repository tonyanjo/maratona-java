package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Todo valor dividido por zero é igual a zero");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void divideDoisNumeros2(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Todo valor dividido por zero é igual a zero");
            return;
        } else {
            System.out.println(num1 / num2);
        }
    }
}
