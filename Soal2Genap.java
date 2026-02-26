/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
import java.util.Scanner;

public class Soal2Genap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== INPUT =====
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        // ===== PROSES =====
        int jumlah = 0;
        String daftarGenap = "";
        String perhitungan = "";

        if (batasAwal <= batasAkhir) {

            for (int i = batasAwal; i <= batasAkhir; i++) {
                if (i % 2 == 0) {
                    jumlah += i;

                    // Untuk tampilan daftar angka (pakai spasi)
                    daftarGenap += i + "  ";

                    // Untuk tampilan perhitungan (pakai tanda +)
                    if (perhitungan.equals("")) {
                        perhitungan = String.valueOf(i);
                    } else {
                        perhitungan += " + " + i;
                    }
                }
            }

            // ===== OUTPUT =====
            if (!daftarGenap.equals("")) {
                System.out.println("Bilangan genapnya adalah: " + daftarGenap.trim());
                System.out.println("Perhitungannya: " + perhitungan + " = " + jumlah);
                System.out.println("Jumlah deret bilangan genap dari "
                        + batasAwal + " sampai "
                        + batasAkhir + " adalah: " + jumlah);
            } else {
                System.out.println("Tidak ada bilangan genap dalam rentang tersebut.");
            }

        } else {
            System.out.println("Batas awal harus lebih kecil atau sama dengan batas akhir.");
        }

        input.close();
    }
}