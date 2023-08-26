package com.juaracoding;

import java.util.ArrayList;
import java.util.List;

public class Soal2 {
    public static void main(String[] args) {
        int n = 9;
        String pattern = generatePattern(n); // inisialisasi pola awal

        printPattern(pattern); // mencetak pola awal

        for (int i = 0; i < n / 2; i++) {
            pattern = removeFirstAndLastCharacter(pattern); // menghapus karakter pertama dan terakhir
            printPattern(pattern); // mencetak pola yang telah diubah
        }
    }

    // method untuk inisiasi pola dengan menambahkan angka dan garis bawah
    private static String generatePattern(int n) {
        StringBuilder pattern = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (isOdd(i)) {
                pattern.append(i);
            } else {
                pattern.append("_");
            }
        }

        return pattern.toString();
    }
    // method untuk mengecek apakah number berupa angka ganjil
    public static boolean isOdd(int number){
        if(number % 2 == 1){
            return true;
        }
        return false;
    }
    // method untuk mencetak pola
    private static void printPattern(String pattern) {
        System.out.println(pattern);
    }

    // method menghapus karakter pertama dan terakhir dari sebuah string
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }
}

