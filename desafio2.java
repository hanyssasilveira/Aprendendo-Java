import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você estuda bem? (S/N)");
        boolean estudaBem = scanner.next().equalsIgnoreCase("S");

        System.out.println("Seu LinkedIn está atualizado? (S/N)");
        boolean linkedinAtualizado = scanner.next().equalsIgnoreCase("S");

        System.out.println("Seu currículo está pronto? (S/N)");
        boolean curriculoPronto = scanner.next().equalsIgnoreCase("S");

        int pontuacao = 0;

        if (estudaBem) {
            pontuacao = pontuacao + 50;
        }

        if (linkedinAtualizado) {
            pontuacao = pontuacao + 25;
        }

        if (curriculoPronto) {
            pontuacao = pontuacao + 25;
        }

        System.out.println();
        System.out.println("Pontuação final: " + pontuacao);

        if (pontuacao >= 70) {
            System.out.println("Você está bem encaminhado para conseguir uma vaga!");
        } else {
            System.out.println("Você precisa se organizar melhor.");
        }

        scanner.close();

    }
}
