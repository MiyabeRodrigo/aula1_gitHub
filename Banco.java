package aplication;

import entities.Conta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Banco {

    public static void main (String [] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc  = new Scanner(System.in);
        String data;
        int i;

        List<Conta> contas = new ArrayList<>();

        System.out.println("Informe quantas contas você quer criar:");
        i = sc.nextInt();

        for (int j = 1; j <= i; j++) {
            Conta conta = new Conta();

            System.out.println("Digite o seu nome");
            sc.nextLine();
            conta.setNome(sc.nextLine());

            System.out.println("Numero da conta");
            conta.setnConta(sc.nextInt());

            System.out.println("Digite o saldo Inicial");
            conta.setSaldo(sc.nextDouble());

            sc.nextLine();
            System.out.println("Digite a data de hoje");
            data = sc.nextLine();

            System.out.println("Digite o valor do deposito");
            conta.deposito(sc.nextDouble());

            System.out.println("Digite o valor do saque");
            conta.saque(sc.nextDouble());

            //System.out.println(conta.toString());

            System.out.println("Rendimento da conta: " + conta.calcRendimento());

            contas.add(conta);
        }

        for (Conta conta : contas) {
            System.out.println(conta.getData());
        }

        sc.close();
    }
}
