import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;

        
        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido!");
            }

        } while (nota < 0 || nota > 10); 

        System.out.println("Nota válida: " + nota);
    }
}
