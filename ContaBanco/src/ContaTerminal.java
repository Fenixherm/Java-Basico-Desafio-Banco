import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor, digite o Número da conta !");
        numeroConta = ler.nextInt();

        System.out.println("Por favor, digite seu nome !");
        nomeCliente = ler.next();

        System.out.println("Por favor, digite sua agência !");
        agencia = ler.next();

        System.out.println("Por favor, digite seu saldo !");
        saldo = ler.nextFloat();

        Imprimir(numeroConta, agencia, nomeCliente, saldo);

    }

    public static void Imprimir(int numeroConta, String agencia, String nomeCliente, float saldo) {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
