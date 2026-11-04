package com.example.tp9;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("--- Test Addition ---");
        System.out.println("5 + 3 = " + calc.add(5, 3));

        System.out.println("--- Test Division Valide ---");

        try {
            System.out.println("10 / 2 = " + calc.divide(10, 2));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("--- Test Division par Zéro ---");

        try {
            System.out.println("10 / 0 = " + calc.divide(10, 0));
        } catch (IllegalArgumentException e) {
            System.err.println("Erreur interceptée : " + e.getMessage());
        }
    }
}