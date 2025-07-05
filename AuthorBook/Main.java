/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspboaufa;

/**
 *
 * @author aufaa
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Author author = null;
        Book book = null;
        int pilihan;

        do {
            System.out.println("=== MENU PROGRAM BOOK & AUTHOR ===");
            System.out.println("1. Input Data Author");
            System.out.println("2. Input Data Book");
            System.out.println("3. Tampilkan Data Book");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = in.nextInt();
            in.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Input Data Author ===");
                    System.out.print("Masukkan nama author: ");
                    String name = in.nextLine();
                    System.out.print("Masukkan email author: ");
                    String email = in.nextLine();
                    author = new Author(name, email);
                    System.out.println("Data Author berhasil disimpan.\n");
                    break;

                case 2:
                    if (author == null) {
                        System.out.println("Silakan input data Author terlebih dahulu!\n");
                        break;
                    }
                    System.out.println("\n=== Input Data Book ===");
                    System.out.print("Masukkan ISBN buku: ");
                    String isbn = in.nextLine();
                    System.out.print("Masukkan nama buku: ");
                    String bookName = in.nextLine();
                    System.out.print("Masukkan harga buku: ");
                    double price = in.nextDouble();
                    System.out.print("Masukkan jumlah qty (0 jika kosong): ");
                    int qty = in.nextInt();
                    in.nextLine();

                    book = new Book(isbn, bookName, author, price, qty);
                    System.out.println("Data Book berhasil disimpan.\n");
                    break;

                case 3:
                    if (book == null) {
                        System.out.println("Belum ada data Book yang dapat ditampilkan.\n");
                    } else {
                        System.out.println("\n=== Data Buku & Author ===");
                        System.out.println(book.toString() + "\n");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.\n");
            }
        } while (pilihan != 4);

        in.close();
    }
}

