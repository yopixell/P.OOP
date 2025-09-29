/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_tugas1;

/**
 *
 * @author hero
 */
public abstract class produk {
    protected String nama;
    protected double harga;
    
    public produk (String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public abstract double hitungDiskon();
    
    public double hargaSetelahDiskon() {
        return harga - hitungDiskon();
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }
}
