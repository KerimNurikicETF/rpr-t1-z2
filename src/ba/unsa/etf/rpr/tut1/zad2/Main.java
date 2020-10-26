package ba.unsa.etf.rpr.tut1.zad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Unesite broj");
        n = input.nextInt();
        for (int i = 1; i < n; i++) {
            if(i%sumaCifara(i)==0) System.out.println(i);
        }
    }

    public static int sumaCifara(int n) {
        int sumaCifara = 0;
        while (n != 0) {
            sumaCifara = sumaCifara + (n % 10);
            n = n / 10;
        }
        return sumaCifara;

    }
}
