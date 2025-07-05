package tugas1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== PROGRAM BANGUN DATAR ===");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Persegi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Lingkaran ===");
                    System.out.print("Masukkan radius: ");
                    double radius = in.nextDouble();
         
                    {
                        System.out.print("Masukkan warna: ");
                        String color = in.next();
                        
                                
                        System.out.print("Apakah terisi? (true/false): ");
                        boolean filled = in.nextBoolean();

                        Circle circle1 = new Circle(color, filled, radius);
                        System.out.println(circle1.toString());
                    }
                    break;

                case 2:
                    System.out.println("\n=== Persegi Panjang ===");
                    System.out.print("Masukkan lebar: ");
                    double width = in.nextDouble();
                    System.out.print("Masukkan panjang: ");
                    double length = in.nextDouble();
                    
                    {
                        System.out.print("Masukkan warna: ");
                        String color = in.next();
                        System.out.print("Apakah terisi? (true/false): ");
                        boolean filled = in.nextBoolean();
                        
                        Rectangle rectangle1 = new Rectangle(color, filled, width, length);
                        System.out.println(rectangle1.toString());
                    }
                    break;

                case 3:
                    System.out.println("\n=== Persegi ===");
                    System.out.print("Masukkan sisi: ");
                    double side = in.nextDouble();

                   {
                        System.out.print("Masukkan warna: .");
                        String color = in.next();
                        System.out.print("Apakah terisi? (true/false): ");
                        boolean filled = in.nextBoolean();

                        Square square1 = new Square(color, filled, side);
                        System.out.println(square1.toString());
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 4);
    }
}
