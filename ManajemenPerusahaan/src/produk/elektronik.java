/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produk;
/**
 *
 * @author hero
 */
public class elektronik extends produk {
    private int garansi;
    
    public elektronik(String namaProduk, double harga, int garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Produk       : " + getNamaProduk() +
                "\nHarga             : " + formatRp(getHarga()) + 
                "\nGaransi           : " + garansi + " tahun");
    }
}