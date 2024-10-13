/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul1_fauziah;

/**
 *
 * @author LENOVO
 */
public class Penumpang {
    
    private String nik;
    private String namaDepan;
    private String namaBelakang;
    
    public Penumpang(String nik, String namaDepan, String namaBelakang) {
        this.nik = nik;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }
    
    public void tampilDaftarPenumpang() {
        System.out.println("Nomor Induk Kependudukan: "+this.nik);
        System.out.println("Nama Depan: "+this.namaDepan);
        System.out.println("Nama Belakang: "+this.namaBelakang);
    }
        
}
