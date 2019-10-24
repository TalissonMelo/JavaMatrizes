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
public class ArrayExerc2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Tamanho da MATRIZ: ");
        int n = input.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j] = input.nextInt();

            }

        }

        System.out.print("Principal Diagonal:");

        for (int i = 0; i < mat.length; i++) {

            System.out.print(mat[i][i] + " ");

        }

        int count = 0;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] < 0) {

                    count++;

                }

            }

        }
        System.out.println();
        System.out.println("Números Negativos: " + count);

        input.close();
    }

}
