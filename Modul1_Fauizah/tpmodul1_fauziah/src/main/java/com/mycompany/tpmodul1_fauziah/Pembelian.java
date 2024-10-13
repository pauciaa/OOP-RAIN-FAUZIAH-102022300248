/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul1_fauziah;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Pembelian {
    
    public static void main(String[] args) {
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList();
        daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", (float) 1200000.0));
        daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", (float) 1350000.0));
        
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        
        Penumpang penumpang = null;
        Penerbangan pembelian = null;
        
        while (true) {
            System.out.println("======== EAD Ticket Booking System ========");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.println("Silahkan pilih menu: ");
            pilihan = scanner.nextInt();
            
            if (pilihan == 1) {
                for (int i=0;i<daftarPenerbangan.size();i++) {
                    System.out.println((i+1)+".");
                    daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                    System.out.println("");
                }
            } else if (pilihan == 2) {
                System.out.println("Masukkan NIK:");
                String nik = scanner.next();
                System.out.println("Masukkan Nama Depan:");
                String namaDepan = scanner.next();
                System.out.println("Masukkan Nama Belakang:");
                String namaBelakang = scanner.next();
                
                penumpang = new Penumpang(nik, namaDepan, namaBelakang);
                System.out.println("\nTerima Kasih telah mengisi Data Pelanggan. Silahkan Pilih Tiket Penerbangan yang Tersedia");
                System.out.println("--------------------");
                for (int i=0;i<daftarPenerbangan.size();i++) {
                    System.out.println((i+1)+".");
                    daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                    System.out.println("");
                }
                
                System.out.println("Pilih nomor penerbangan (ex: 1):");
                int no = scanner.nextInt();
                pembelian = daftarPenerbangan.get(no-1);
                
                System.out.println("\nPemesanan Tiket Berhasil Dilakukan, Cek Pesanan Tiket pada Menu (3)\n");
            } else if (pilihan == 3) {
                if (penumpang == null) {
                    System.out.println("Pembelian Tiket Tidak Ada");
                } else {
                    System.out.println("======== Detail Tiket Penerbangan ========");
                    penumpang.tampilDaftarPenumpang();
                    pembelian.tampilDaftarPenerbangan();
                }
                
            } else if (pilihan == 4) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Inputan tidak valid!\n");
            }
        }
        
        
        
        
        
    }
    
}
