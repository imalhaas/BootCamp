import java.util.Scanner;

public class SistemaSoma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A, B;

        System.out.println("Digite o valor de A: ");
        A = input.nextInt();

        System.out.println("Digite o valor de B :");
        B = input.nextInt();

        System.out.println("O valor da soma é: " + (A + B));



    }
}
