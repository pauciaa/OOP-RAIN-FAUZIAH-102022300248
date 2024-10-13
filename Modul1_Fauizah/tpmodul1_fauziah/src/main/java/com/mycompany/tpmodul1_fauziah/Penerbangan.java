/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmodul1_fauziah;

/**
 *
 * @author LENOVO
 */
public class Penerbangan {
    
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;
    
    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }
    
    public String getNomorPenerbangan(){
        return this.nomorPenerbangan;
    }
    
    public String getBandaraKeberangkatan(){
        return this.bandaraKeberangkatan;
    }
    
    public String getBandaraTujuan(){
        return this.bandaraTujuan;
    }
    
    public String getWaktuKeberangkatan(){
        return this.waktuKeberangkatan;
    }
    
    public String getWaktuKedatangan(){
        return this.waktuKedatangan;
    }
    
    public float getHargaTiket(){
        return this.hargaTiket;
    }
    
    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: "+this.nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: "+this.bandaraKeberangkatan+" ---> Bandara Tujuan: "+this.bandaraTujuan);
        System.out.println("Waktu Keberangkatan: "+this.waktuKeberangkatan+" ---> Waktu Kedatangan: "+this.waktuKedatangan);
        System.out.println("Harga Tiket: Rp."+this.hargaTiket);
    }
    
}
