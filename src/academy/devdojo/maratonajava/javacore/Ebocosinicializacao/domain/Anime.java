package academy.devdojo.maratonajava.javacore.Ebocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passada
    // 3 - Bloco de inicializaçao é executado
    // 4 - Construtor é executado

    {
        episodios = new int[100];
        for(int i = 0; i < this.episodios.length; i++){
            this.episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        for (int episodio:episodios){
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
