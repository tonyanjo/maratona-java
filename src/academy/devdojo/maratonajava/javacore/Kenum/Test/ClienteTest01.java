package academy.devdojo.maratonajava.javacore.Kenum.Test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;

import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente.PESSOA_FISICA;
import static academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente.PESSOA_JURIDICA;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Tsubasa", PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Tsubasa", PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
