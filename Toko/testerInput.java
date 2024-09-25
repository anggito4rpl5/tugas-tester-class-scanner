package Toko;

import java.util.Scanner;

public class testerInput {

    public static void main(String[] args) {

        Scanner ito = new Scanner(System.in);
        System.out.println("memilih CD/DVD");
        String pilihan = ito.nextLine();

        System.out.println("name = ");
        String name = ito.nextLine();
        System.out.println("number = ");
        int number = ito.nextInt();
        System.out.println("quantity = ");
        int quantity = ito.nextInt();
        System.out.println("price = ");
        int price = ito.nextInt();
        ito.nextLine();
   
        if (pilihan.equalsIgnoreCase("cd")) {
            System.out.println("artis = ");
            String artis = ito.nextLine();
            System.out.println("label = ");
            String label = ito.nextLine();
            System.out.println("numsong = ");
            int numsong = ito.nextInt();
            cd c1 = new cd(number, name, quantity, price, artis, numsong, label);
            c1.print();

        } else if (pilihan.equalsIgnoreCase("dvd")) {

            System.out.println("rating = ");
            String rating = ito.nextLine();
            System.out.println("studio = ");
            String studio = ito.nextLine();
            System.out.println("Legth: ");
            int length = ito.nextInt();
            dvd c2 = new dvd(number, name, quantity, price, length, rating, studio);
            c2.print();

        }
        ito.close();
    }
}
