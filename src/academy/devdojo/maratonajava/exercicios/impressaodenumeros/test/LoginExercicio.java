package academy.devdojo.maratonajava.exercicios.impressaodenumeros.test;

import java.util.Scanner;

import static java.lang.System.in;

public class LoginExercicio {
    private String login = "tony";
    private String password = "123123";

    private String loginColetado;
    private String senhaColetada;

    private int tentativa = 0;


    public void logar() {
        while (this.tentativa < 3) {
            coletarCredenciais();
            if (login.equals(loginColetado) && password.equals(senhaColetada)) {
                System.out.println("Logado com Sucesso");
                return;
            } else {
                System.out.println("Usuario ou senha incorretos");
                this.tentativa++;
                System.out.println("Voce tem " + (3 - this.tentativa) + " tentativa(s)");
                if (tentativa == 3){
                    System.out.println("Usuario Bloqueado!");
                }
            }
        }
    }

    public void coletarCredenciais(){
        Scanner scanner = new Scanner(in);
        System.out.println("Insira o Usuario:");
        this.loginColetado = scanner.nextLine();
        System.out.println("Insira a Senha:");
        this.senhaColetada = scanner.nextLine();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
