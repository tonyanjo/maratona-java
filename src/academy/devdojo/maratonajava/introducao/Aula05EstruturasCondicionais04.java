package academy.devdojo.maratonajava.introducao;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 30000;
        double taxa;
        if (salarioAnual <= 34712){
            taxa = 0.097;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            taxa = 0.3735;
        } else {
            taxa = 0.4950;
        }

        DecimalFormat formato = new DecimalFormat("#.##");
        String taxaFormatada = formato.format(taxa * 100);

        System.out.println("Seu salário é de €" + salarioAnual);
        System.out.println("A taxa respectiva do seu salário é " + taxaFormatada + "%");
        System.out.println("Será descontado um total de €" + (salarioAnual * taxa));
    }
}
