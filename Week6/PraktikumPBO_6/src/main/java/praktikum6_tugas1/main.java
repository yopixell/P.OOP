/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6_tugas1;

/**
 *
 * @author hero
 */
public class main {
    public static void main(String[] args) {
        keranjangBelanja keranjang1 = new keranjangBelanja();
        
        produk buku1 = new buku("Buku Memasak 2025", 50000);
        produk hp = new elektronik("SungSam", 3000000);
        produk celana_dalam = new pakaian("Sempak", 40000);
        
        keranjang1.tambahProduk(buku1);
        keranjang1.tambahProduk(hp);
        keranjang1.tambahProduk(celana_dalam);
        
        keranjang1.tampilkanProduk();
        System.out.println("Total Harga Setelah Diskon: " + keranjang1.hitungTotal());
    }
}
