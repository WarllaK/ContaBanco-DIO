package org.example;
import java.util.Scanner;

public class ContaTerminal {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int numero;
                String agencia;
                String nomeCliente;
                double saldo;

                System.out.println("Por favor, digite o número da Agência !");
                agencia = scanner.nextLine();

                System.out.println("Por favor, digite o número da Conta !");
                numero = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha pendente

                System.out.println("Por favor, digite o seu Nome !");
                nomeCliente = scanner.nextLine();

                System.out.println("Por favor, digite o seu Saldo !");
                saldo = scanner.nextDouble();

                String mensagem = "Olá ".concat(nomeCliente)
                        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                        .concat(agencia).concat(", conta ")
                        .concat(String.valueOf(numero))
                        .concat(" e seu saldo ")
                        .concat(String.valueOf(saldo))
                        .concat(" já está disponível para saque.");

                System.out.println(mensagem);

                scanner.close();
            }
}