package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeException02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }

    /**
     *
     * @param a não pode ser zero
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso um ou ambos os parâmetros sejam zero
     */

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0 || a == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}
