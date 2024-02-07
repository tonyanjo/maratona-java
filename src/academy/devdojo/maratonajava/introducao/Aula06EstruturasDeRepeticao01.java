package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for

        // while
        int count = 16;
        while(count < 10){
            System.out.println(count);
            count++;
        }

        //do-while
        do {
            System.out.println("dentro do do-while");
        } while (count < 10);

        //for
        for (int i=0; i<10; i++) {
            System.out.println("For " + i);

        }
    }
}
