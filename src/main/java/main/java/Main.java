/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.java;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kategoriBuku = {"Pemrograman", "Matematika", "Jaringan Komputer", "Basis Data"};

        int[][] dataPeminjaman = {
            {5, 8, 3, 6, 9, 4},
            {2, 3, 4, 1, 5, 2},
            {4, 6, 5, 7, 8, 3},
            {7, 5, 6, 8, 9, 6}
        };

        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        boolean jalan = true;
        while (jalan) {
            System.out.println("\n--- MENU ANGGOTA 1: KATEGORI & PEMINJAMAN ---");
            System.out.println("1. Tampilkan Kategori Buku (Array 1D)");
            System.out.println("2. Tampilkan Data Peminjaman (Array 2D)");
            System.out.println("3. Keluar Menu Anggota 1");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\n[ Daftar Kategori Buku ]");
                    for (int i = 0; i < kategoriBuku.length; i++) {
                        System.out.println((i + 1) + ". " + kategoriBuku[i]);
                    }
                    break;

                case 2:
                    System.out.println("\n[ Data Jumlah Peminjaman Buku per Kategori & Hari ]");
                    System.out.print(String.format("%-20s", "Kategori"));
                    for (String h : hari) {
                        System.out.print(String.format("%-10s", h));
                    }
                    System.out.println();

                    for (int i = 0; i < kategoriBuku.length; i++) {
                        System.out.print(String.format("%-20s", kategoriBuku[i]));
                        for (int j = 0; j < hari.length; j++) {
                            System.out.print(String.format("%-10d", dataPeminjaman[i][j]));
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    jalan = false;
                    System.out.println("Keluar dari menu Anggota 1.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}