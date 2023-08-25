package com.juaracoding;

public class Soal2 {
    public static void main(String[] args) {
        int t = 1;
        for (int i = 10; i >= 1; i--) {
            if (i % 2 == 1) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 == 1) {
                        System.out.print(j);
                    } else if (j % 2 == 0) {
                        System.out.print("_");
                    }
                }
                System.out.println();
            }
        }
    }
}
