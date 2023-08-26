package com.juaracoding;

public class Soal1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { // membuat perulangan dari 1 sampai 100
            if (i % 3 == 0 && i % 5 == 0) { // mengecek kondisi apakah i merupakan kelipatan 3 dan 5
                System.out.println("BizzBuzz"); // mencetak BizzBuzz jika kondisi bernilai true
            } else if (i % 3 == 0) { // mengecek kondisi apakah i merupakan kelipatan 3
                System.out.println("Bizz"); // mencetak Bizz jika kondisi bernilai true
            } else if (i % 5 == 0) { // mengecek kondisi apakah i merupakan kelipatan 5
                System.out.println("Buzz"); // mencetak Buzz jika kondisi bernilai true
            } else { // mengecek kondisi apakah i bukan kelipatan 3 dan 5, kelipatan 3, dan kelipatan 5
                System.out.println(i); // mencetak i jika kondisi bernilai true
            }
        }
    }
}