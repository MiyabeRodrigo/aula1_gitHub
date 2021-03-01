package aplication;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


/**
 * The type Executavel.
 */
public class Executavel {


    /**
     * Main.
     *
     * @param args the args
     */
    public static void main (String args[]) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        int idTemp;
        boolean encontrado = false;
        System.out.println("Quantos funcionarios deseja cadastrar");
        n = sc.nextInt();

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Funcionario funcionario = new Funcionario();

            do {
                System.out.println("Informe o id do funcionario");
                idTemp = sc.nextInt();

                for (Funcionario funcionario1 : funcionarios) {
                    if (funcionario1.getId() == idTemp) {
                        System.out.println("ID ja utilizado!");
                        encontrado = true;
                        break;
                    } else {
                        encontrado = false;
                    }
                }
            } while (encontrado == true);

            if (encontrado == false) {
                funcionario.setId(idTemp);

                System.out.println("Digite o nome do funcionario");
                funcionario.setNome(sc.next());

                System.out.println("Informe salario");
                funcionario.setSalario(sc.nextDouble());

                funcionarios.add(funcionario);

            }

        }

        encontrado = false;
        do {
            System.out.println("Digite o ID do funcionario para dar aumento");
            idTemp = sc.nextInt();
            for (Funcionario funcionario1 : funcionarios) {
                if (funcionario1.getId() == idTemp) {
                    encontrado = true;
                    System.out.println("Informe porcentagem de aumento");
                    double porcentagem = sc.nextDouble();
                    funcionario1.aumento(porcentagem);
                    break;
                }
            }
            if (encontrado == false) {
                System.out.println("ID nao encontrado");
            }
        } while (encontrado == false);

        for (Funcionario funcionario1 : funcionarios) {
            System.out.println("Nome: " + funcionario1.getNome());
            System.out.println("Salario: " + funcionario1.getSalario());
            System.out.println("ID: " + funcionario1.getId());

        }

    }
    }