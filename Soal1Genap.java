/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
import java.util.Scanner;

public class Soal1Genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== INPUT =====
        System.out.print("Masukkan jumlah perulangan (N): ");
        int N = input.nextInt();

        // ===== PROSES =====
        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                
                // ===== OUTPUT =====
                System.out.println(i + ". Saya senang belajar bahasa Java");
            }
        } else {
            
            // ===== OUTPUT =====
            System.out.println("Jumlah perulangan harus lebih dari 0.");
        }

        input.close();
    }
}
