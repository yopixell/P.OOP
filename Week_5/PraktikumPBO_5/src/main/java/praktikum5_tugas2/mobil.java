/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas2;

/**
 *
 * @author hero
 */
public class mobil extends kendaraanDarat {
    int jumlahPintu;
    int kecepatan;
    
    public mobil(String merek, int tahunProduksi, String jenis, String bahanBakar, int jumlahPintu, int kecepatan) {
        super(merek, tahunProduksi, jenis, bahanBakar);
        this.jumlahPintu = jumlahPintu;
        this.kecepatan = kecepatan;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Jumlah Pintu        : " + jumlahPintu);
        System.out.println("Kecepatan Maksimal  : " + kecepatan + "km/h");
    }
}
