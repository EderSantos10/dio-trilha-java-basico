import java.util.Scanner;

import domain.Cliente;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();

        System.out.println("Por favor, digite o seu nome:");
        cliente.setNome(scanner.nextLine());

        System.out.println("Por favor, digite o número da Agência:");
        cliente.setAgencia(scanner.nextLine());

        System.out.println("Por favor, digite o número da Conta:");
        cliente.setNumero(scanner.nextInt());

        System.out.println("Por favor, digite o saldo:");
        cliente.setSaldo(scanner.nextDouble());

        scanner.close();

        System.out.println("\nOlá " + cliente.getNome() +
                ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                cliente.getAgencia() + ", conta " + cliente.getNumero() +
                " e seu saldo é de R$" + cliente.getSaldo() + " já está disponível para movimentação.");
    }
}
