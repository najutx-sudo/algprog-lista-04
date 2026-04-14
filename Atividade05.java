import java.util.Scanner;
public class Atividade05 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char repetir;

        do {

            double popA, popB;
            double taxaA, taxaB;

          
            do {
                System.out.print("Digite a população do país A: ");
                popA = sc.nextDouble();

                if (popA <= 0) {
                    System.out.println("Valor inválido! A população deve ser maior que zero.");
                }

            } while (popA <= 0);

           
            do {
                System.out.print("Digite a população do país B: ");
                popB = sc.nextDouble();

                if (popB <= 0) {
                    System.out.println("Valor inválido! A população deve ser maior que zero.");
                }

            } while (popB <= 0);

            
            do {
                System.out.print("Digite a taxa de crescimento de A (%): ");
                taxaA = sc.nextDouble();

                if (taxaA <= 0) {
                    System.out.println("Valor inválido! A taxa deve ser maior que zero.");
                }

            } while (taxaA <= 0);

            
            do {
                System.out.print("Digite a taxa de crescimento de B (%): ");
                taxaB = sc.nextDouble();

                if (taxaB <= 0) {
                    System.out.println("Valor inválido! A taxa deve ser maior que zero.");
                }

            } while (taxaB <= 0);

            
            taxaA = taxaA / 100;
            taxaB = taxaB / 100;

            int anos = 0;

            
            while (popA < popB) {
                popA += popA * taxaA;
                popB += popB * taxaB;
                anos++;
            }

          
            System.out.println("\nAnos necessários: " + anos);
            System.out.println("População final de A: " + (int) popA);
            System.out.println("População final de B: " + (int) popB);

            
            System.out.print("\nDeseja repetir? (s/n): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 's' || repetir == 'S');

        sc.close();
    }
}
