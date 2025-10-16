package com.example.Modulo.Dois.AtividadeDois;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        NumeroPrimo primo = n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println("Digite um número para verificar se ele é primo!");
        var numero = scanner.nextInt();
        System.out.println(primo.verificarPrimo(numero));
    }
}


