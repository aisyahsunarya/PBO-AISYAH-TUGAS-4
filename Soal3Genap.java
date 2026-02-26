/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
import java.util.Scanner;

public class Soal3Genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== INPUT =====
        System.out.print("Masukkan bilangan pertama (a): ");
        int a = input.nextInt();

        System.out.print("Masukkan bilangan kedua (b): ");
        int b = input.nextInt();

        // ===== PROSES =====
        while (b != 0) {
            int sisa = a % b;
            a = b;
            b = sisa;
        }

        // ===== OUTPUT =====
        System.out.println("PBB adalah: " + a);

        input.close();
    }
}