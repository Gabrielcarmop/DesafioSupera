package com.company;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //Decleração de variaveis
        int n, i, auxp = 0, auxi = 0, aux, cont = 0, aux1 = 0;
        int pares = 0, impares = 0;
        //Leitura do tamanho do vetor
        n = ler.nextInt();
        int vetor[] = new int[n];
        //Leitura dos valores
        for (i = 0; i < n; i++) {
            vetor[i] = ler.nextInt();
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        int par[] = new int[pares];
        int impar[] = new int[impares];
        //Divisão de par e impares
        for (i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                par[auxp] = vetor[i];
                auxp++;
            } else {
                impar[auxi] = vetor[i];
                auxi++;
            }
        }
        //Ordenação dos valores pares
        for (i = 0; i < pares; i++) {
            for (int j = 0; j < pares; j++) {
                if (par[i] < par[j]) {
                    aux = par[i];
                    par[i] = par[j];
                    par[j] = aux;
                }
            }
        }
        //Ordenação dos valores impares
        for (i = 0; i < impares; i++) {
            for (int j = 0; j < impares; j++) {
                if (impar[i] > impar[j]) {
                    aux = impar[i];
                    impar[i] = impar[j];
                    impar[j] = aux;
                }
            }
        }

        //Passagem para o vetor Principal
        for (i = 0; i < pares; i++) {
            vetor[i] = par[i];
        }
        for (i = 0; i < impares; i++) {
            vetor[pares] = impar[i];
            pares++;
        }
        for (i = 0; i < n; i++) {
            System.out.printf("%d\n", vetor[i]);
        }
    }
}
