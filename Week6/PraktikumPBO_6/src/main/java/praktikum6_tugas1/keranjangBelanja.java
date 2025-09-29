/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_tugas1;

/**
 *
 * @author hero
 */
import java.util.ArrayList;
import java.util.List;

class keranjangBelanja {
    private List<produk> daftarProduk;
    
    public keranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }
    
    public void tambahProduk(produk p) {
        daftarProduk.add(p);
    }
    
    public double hitungTotal() {
        double total = 0;
        for (produk p : daftarProduk) {
            total += p.hargaSetelahDiskon();
        }
        return total;
    }
    
    public void tampilkanProduk() {
        for (produk p : daftarProduk) {
            System.out.println(p.getNama() + " | Harga Asli: " + p.getHarga() +
                    " | Diskon: " + p.hitungDiskon() +
                    " | Harga Setelah Diskon: " + p.hargaSetelahDiskon());
        }
    }
}
