
    import java.util.Random;
import java.util.Scanner;

    public class JogoAdivinhacao {

        public static void main(String[] args) {

            int numeroSorteado = sortearNumero();
            int chute, tentativas = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Tente adivinhar o número sorteado de 1 a 100.");

            do {
                System.out.print("Digite seu chute: ");
                chute = scanner.nextInt();

                if (chute < numeroSorteado) {
                    System.out.println("O número sorteado é maior. Tente novamente.");
                } else if (chute > numeroSorteado) {
                    System.out.println("O número sorteado é menor. Tente novamente.");
                }

                tentativas++;
            } while (chute != numeroSorteado);

            System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativas.");
        }

        private static int sortearNumero() {
            Random random = new Random();
            return random.nextInt(100) + 1;
        }
    }


