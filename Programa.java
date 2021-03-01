package aplication;

import entities.Pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Pensionato [] vect = new Pensionato[10];

        System.out.println("Digite o numero de alunos ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){

            System.out.println("Digite o seu nome");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite o seu email");
            String email = sc.nextLine();
            System.out.println("Digite o seu quarto");
            int quarto = sc.nextInt();
            vect[quarto] = new Pensionato(nome,email);
        }
        System.out.println();
        System.out.println("Quartos alugados");
        for (int i = 0; i < 10;  i++){

            if(vect[i]!= null){
                System.out.println(i + ": " + vect[i]);
            }

        }

    }
}
