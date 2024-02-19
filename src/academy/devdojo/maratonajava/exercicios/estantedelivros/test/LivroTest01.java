package academy.devdojo.maratonajava.exercicios.estantedelivros.test;

import academy.devdojo.maratonajava.exercicios.estantedelivros.domain.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Código Limpo", "Robert C. Martin", "Alta Books", 422);
        Livro livro2 = new Livro("Harry Potter e o Cálice de fogo", "J. K. Rowling", "Rocco", 980);

        livro1.imprime();
        livro2.imprime();

        System.out.println(livro1.getAutor());
        System.out.println(livro2.getAutor());
    }
}
