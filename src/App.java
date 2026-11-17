import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static String avaliarSenha(String senha) {
        List<String> criteriosPendentes = new ArrayList<>();

        if (senha.length() < 8) {
            criteriosPendentes.add("Use pelo menos 8 caracteres.");
        }
        if (senha.codePoints().noneMatch(Character::isDigit)) {
            criteriosPendentes.add("Inclua pelo menos um número.");
        }
        if (senha.codePoints().noneMatch(Character::isUpperCase)) {
            criteriosPendentes.add("Inclua pelo menos uma letra maiúscula.");
        }
        if (senha.codePoints().anyMatch(c -> Character.isWhitespace(c) || Character.isSpaceChar(c))) {
            criteriosPendentes.add("Remova os espaços.");
        }

        if (criteriosPendentes.isEmpty()) {
            return "Senha aprovada";
        }
        return "Senha reprovada\n" + String.join("\n", criteriosPendentes);
    }

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite uma senha fictícia: ");
            if (entrada.hasNextLine()) {
                System.out.println(avaliarSenha(entrada.nextLine()));
            }
        }
    }
}
