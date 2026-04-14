import java.util.Scanner;
public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        
        do {
            System.out.print("Digite o primeiro número: ");
            a = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            b = sc.nextInt();

            if (a == b) {
                System.out.println("Os números devem ser diferentes!");
            }

        } while (a == b);

     
        int inicio, fim;

        if (a < b) {
            inicio = a;
            fim = b;
        } else {
            inicio = b;
            fim = a;
        }

        System.out.println("Números no intervalo:");

        
        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
        }
    }
}