package academy.devdojo.maratonajava.exercicios.impressaodenumeros.test;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class LoginExercicio {
    private String login = "tony";
    private String password = "123123";

    private String loginColetado;
    private String senhaColetada;
    private String captchaColetado;
    private String caracteres = "abcdefghijklmnoprstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private int tentativa = 0;
    private StringBuilder captcha = new StringBuilder();

    public void iniciadorCaptcha() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(this.caracteres.length());
            this.captcha.append(caracteres.charAt(index));
        }
        System.out.println("Captcha: " + captcha);
    }


    public void coletarCredenciais() {
        Scanner scanner = new Scanner(in);
        System.out.println("Insira o Usuario:");
        this.loginColetado = scanner.nextLine();
        System.out.println("Insira a Senha:");
        this.senhaColetada = scanner.nextLine();
    }

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
                if (tentativa == 3) {
                    System.out.println("Resolva o Captcha para provar que voce é humano.");
                    iniciadorCaptcha();
                    Scanner scanner = new Scanner(in);
                    this.captchaColetado = scanner.nextLine();
                    if (this.captchaColetado.equals(captcha.toString())) {
                        System.out.println("Tentativas renovadas, tente novamente.");
                        tentativa = 0;
                    } else {
                        System.out.println("Usuario Bloqueado!");
                        break;
                    }
                }
            }
        }
    }

}
