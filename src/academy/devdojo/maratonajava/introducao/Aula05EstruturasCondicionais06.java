package academy.devdojo.maratonajava.introducao;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        byte dia = 18;
        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Valor inválido: insira um valor de 1 a 7");
                break;
        }
    }
}
