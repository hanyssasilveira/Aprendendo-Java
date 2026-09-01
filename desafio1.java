import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Você estudou Banco de Dados: (S/N) ");
        boolean bancoDados = scanner.next().equalsIgnoreCase("S");

        System.out.println("Você estudou String? (S/N) ");
        boolean string = scanner.next().equalsIgnoreCase("S");

        System.out.println("Você estudou APIs REST? (S/N) ");
        boolean api = scanner.next().equalsIgnoreCase("S");

        System.out.println("Você fez projetos usando Microsserviços? (S/N) ");
        boolean microsserv  = scanner.next().equalsIgnoreCase("S");

        if (bancoDados && string && api && microsserv) {
            System.out.println(nome + ". Parabéns! Você consegue se candidatar a uma vaga!");

        }else{
            System.out.println(nome + ". Você ainda não consegue. Continue estudando e praticando!");
        }

        scanner.close();



    }
}
