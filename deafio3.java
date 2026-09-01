import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Você já montou um currículo organizado para a área de programação? (S/N)");
        boolean curriculo = scanner.next().equalsIgnoreCase("S");

        System.out.println("Você já organizou seu LinkedIn para a área de programação? (S/N)");
        boolean linkedin = scanner.next().equalsIgnoreCase("S");

        if (curriculo && linkedin) {
            System.out.println("Parabéns! Você já está cuidando da sua apresentação profissional!");
        } else {
            System.out.println("Não desanime!");
            System.out.println("Um currículo bem feito pode até compensar pouca experiência.");
            System.out.println("Continue se preparando e organize seu perfil profissional!");
        }

        scanner.close();



    }
}
