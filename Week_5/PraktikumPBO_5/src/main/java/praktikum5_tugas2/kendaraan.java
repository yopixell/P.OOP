/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas2;
/**
 *
 * @author hero
 */
public class kendaraan {
    private String merek;
    protected int tahunProduksi;
    public String jenis;    
    
    public kendaraan(String merek, int tahunProduksi, String jenis) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.jenis = jenis;
    }
    
    public String getMerek() {
        return merek;
    }
    public void setMerek() {
        this.merek = merek;
        
    }
    public void info() {
        System.out.println("Merek               : " + merek);
        System.out.println("Tahun Produksi      : " + tahunProduksi);
        System.out.println("Nama Kendaraan      : " + jenis);
    }
}
