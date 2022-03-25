package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i,aux,cont = 0;
        int n = ler.nextInt();
        int k = ler.nextInt();
        int vetor[] = new int[n];
        for(i=0;i<n;i++){
            vetor[i] = ler.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (vetor[i] - vetor[j] == k) {
                    cont++;
                }
            }
        }
        System.out.printf("%d\n",cont);

    }
}
