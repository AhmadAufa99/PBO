package tugas1pboe;

import java.util.Random;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int A[], B[], C[];
        int nA, nB, i;
        Scanner arr = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Masukkan ukuran array A: ");
        nA = arr.nextInt();
        System.out.print("Masukkan ukuran array B: ");
        nB = arr.nextInt();
        System.out.println("=========================");
        
        A = new int[nA];
        B = new int[nB];
        C = new int[nA + nB];
        
        System.out.println("Array A: ");
        for (i = 0; i < nA; i++) {
            A[i] = rand.nextInt(100);
            System.out.print(A[i] + " ");
        }
        System.out.println();
        
        System.out.println("Array B: ");
        for (i = 0; i < nB; i++) {
            B[i] = rand.nextInt(100);
            System.out.print(B[i] + " ");
        }
        System.out.println();
        
        System.out.println("Array C: ");
        if (nA >= nB) {
            for(i = 0; i < nA; i++) 
                System.out.print(A[i] + " ");
            for(i = 0; i < nB; i++)
                System.out.print(B[i] + " ");
        } else {
            for(i = 0; i < nB; i++)
                System.out.print(B[i] + " ");
            for(i = 0; i < nA; i++) 
                System.out.print(A[i] + " ");
        }
        
        System.out.println();
    }
}