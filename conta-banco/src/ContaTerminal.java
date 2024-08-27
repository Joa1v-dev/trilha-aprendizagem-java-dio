
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, para criarmos sua conta poderia nos dizer qual o seu nome?:");
        String nome = scanner.next();

        System.out.println(" Poderia nos dizer qual o seu sobrenome?:");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua conta:");
        int contaNumero = scanner.nextInt();

        System.out.println("Por favor informe seu saldo atual:R$");
       double saldo = scanner.nextDouble();

       System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + " " + "conta " + contaNumero + " " + "e seu saldo de R$ " + saldo + " " + "ja está disponível");




    }
}
