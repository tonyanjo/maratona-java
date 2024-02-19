package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização estático é executado somente uma vez quando a JVM carregar a classe
    // 0.1 - Em caso de multiplas instâncias de Blocos de inicialização estático, serão executados na ordem em que aparecem
    // 1 - Bloco de inicialização NÃO-estático é executado toda vez que a JVM carregar a classe
    // 1.1 - Em caso de multiplas instâncias de Blocos de inicialização NÃO-estático, serão executados na ordem em que aparecem
    // 2 - Alocado espaço em memória pro objeto
    // 3 - Cada atributo de classe é criado e inicializado com valores default ou o que for passada
    // 4 - Bloco de inicializaçao é executado
    // 5 - Construtor é executado

    static {
        System.out.println("Dentro do Bloco de Inicialização");
        Anime.episodios = new int[100];
        for (int i = 0; i < Anime.episodios.length; i++) {
            Anime.episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Bloco Estático 1");
    }

    static {
        System.out.println("Bloco Estático 2");
    }

    static {
        System.out.println("Bloco Estático 3");
    }

    {
        System.out.println("Bloco Não Estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
