import java.util.Scanner;
public class Atividade03{ 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo, estadoCivil;

      
        do {
            System.out.print("Nome: ");
            nome = sc.nextLine();
        } while (nome.length() <= 3);

    
        do {
            System.out.print("Idade: ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 150);

        
        do {
            System.out.print("Salário: ");
            salario = sc.nextDouble();
        } while (salario <= 0);

     
        do {
            System.out.print("Sexo (f/m): ");
            sexo = sc.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

      
        do {
            System.out.print("Estado civil (s/c/v/d): ");
            estadoCivil = sc.next().charAt(0);
        } while (estadoCivil != 's' && estadoCivil != 'c' &&
                 estadoCivil != 'v' && estadoCivil != 'd');

        System.out.println("Dados válidos!");
    }
}