import java.util.Scanner;

public class Atividade02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario, senha;

        do {
            System.out.print("Usuário: ");
            usuario = sc.nextLine();

            System.out.print("Senha: ");
            senha = sc.nextLine();

            if (usuario.equals                                                                           (senha)) {
                System.out.println("Erro: senha não pode ser igual ao usuário!");
            }

        } while (usuario.equals(senha));

        System.out.println("Cadastro válido!");
    }
}
