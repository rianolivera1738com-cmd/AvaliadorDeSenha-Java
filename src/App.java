import java.util.Scanner;

public class App {

    public static String avaliarSenha(String senha) {

        return "Senha aprovada";
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma senha fictícia: ");
        String senha = entrada.nextLine();

        String resultado = avaliarSenha(senha);

        System.out.println(resultado);

        entrada.close();
    }
}