import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe scanner
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            // Exibir as mensagens para o usuário
            // Obter pela classe Scanner os valores no terminal

            System.out.println("Digite sua Agência:");
            String $agencia = scanner.nextLine();

            System.out.println("Digite o número da conta:");
            int $numeroConta = scanner.nextInt();

            System.out.println("Digite o seu nome:");
            String $nome = scanner.next();

            System.out.println("Digite o seu saldo:");
            double $saldo = scanner.nextDouble();

            // Exibir a mensagem com os dados da conta
            System.out.println("Olá " + $nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + $agencia + ", conta " + $numeroConta + " e seu saldo " + $saldo + " já está disponível para saque.");
        }

    }
}
