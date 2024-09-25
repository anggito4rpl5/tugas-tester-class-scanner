package Toko;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("berapa jumlah obejct");

        int jumlah = input.nextInt();

        if (jumlah > 10) {
            System.out.println("eror");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            try {
                System.out.println(" silahkan memilih 1 untuk cd dan 2 untuk dvd");

                int pilihan = input.nextInt();

                if (pilihan == 1) {
                    cd c1 = new cd();
                    c1.print();

                } else if (pilihan == 2) {
                    dvd c2 = new dvd();
                    c2.print();

                } else {
                    System.out.println("eror");
                }
            } catch (Exception e) {
                System.out.println("Hanya menerima Angka");
            }

        }

        input.close();
    }
}
