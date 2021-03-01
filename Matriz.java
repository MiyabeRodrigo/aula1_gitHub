package aplication;

import java.util.Scanner;

public class Matriz{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int l = 0, c = 0;

        System.out.println("Digite valor");
        l = sc.nextInt();

        System.out.println("Digite valor");
        c = sc.nextInt();

        int matriz[][] = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < matriz.length; i++)  {
            for (int j = 0; j < matriz[0].length; j++)     {
                System.out.print(matriz[i][j] + " "); //imprime caracter a caracter
            }
            System.out.println(" "); //muda de linha
        }

        System.out.println("Digite um numero");
        int x = sc.nextInt();

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                if(matriz[i][j] == x){
                    System.out.println("Posicao " + i + " " + j);
                        if(j > 0) {
                            System.out.println("Esquerda " + matriz[i][j - 1]);
                        }
                    if(j < c - 1){
                        System.out.println("Direita " + matriz [i][j+1]);
                    }
                    if(i>0){

                        System.out.println("Acima " + matriz[i-1][j]);
                }
                    if(i < l - 1){
                        System.out.println("Down " + matriz [i + 1][j]);
                    }
            }

            }
        }


        }
}
