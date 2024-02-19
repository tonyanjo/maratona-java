package academy.devdojo.maratonajava.exercicios.estantedelivros.domain;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int paginas;

    public Livro(String titulo, String autor, String editora, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.paginas = paginas;
    }

    public void imprime() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("------------------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getPaginas() {
        return paginas;
    }
}

