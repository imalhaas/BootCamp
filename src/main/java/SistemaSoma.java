import java.util.Scanner;

public class SistemaSoma {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Digite o primeiro valor:");
        valor1 = input.nextInt();

        System.out.println("Digite o segundo valor:");
        valor2 = input.nextInt();

        if (valor1 > valor2){
            System.out.println("valor 1 é maior");
        }else {
            System.out.println("valor 1 é menor");
        }



    }
}
