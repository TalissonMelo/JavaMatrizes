/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author talis
 */
public class ArrayExerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Valor da Linha: ");
        int m = input.nextInt();
        System.out.print("Valor do Coluna: ");
        int n = input.nextInt();

        int[][] repet = new int[m][n];
        for (int i = 0; i < repet.length; i++) {
            for (int j = 0; j < repet[i].length; j++) {

                repet[i][j] = input.nextInt();
            }

        }
        
        System.out.print("Digite o numero a ser Procurado: ");
        int x = input.nextInt();

        for (int i = 0; i < repet.length; i++) {

            for (int j = 0; j < repet[i].length; j++) {

                if (repet[i][j] == x) {

                    System.out.println("Posição " + i + "," + j + ":");

                    if (j > 0) {

                        System.out.println("Esquerda: " + repet[i][j - 1]);

                    }

                    if (i > 0) {

                        System.out.println("Acima: " + repet[i - 1][j]);

                    }

                    if (j < repet[i].length - 1) {

                        System.out.println("Direita: " + repet[i][j + 1]);

                    }

                    if (i < repet.length - 1) {

                        System.out.println("Abaixo: " + repet[i + 1][j]);

                    }

                }

            }

        }
        input.close();
    }

}
