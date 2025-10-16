package com.example.Modulo.Dois.AtividadeQuatro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());

        System.out.println("Escreva uma palavra para verificar se ela é um Palindromo");
        var palavra = scanner.nextLine();

        System.out.println(palindromo.verificarPalindromo(palavra));
    }
}


