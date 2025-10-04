/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produk;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author hero
 */
public class produk {
    private String namaProduk;
    private double harga;
    
    public produk (String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    
    
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak boleh negatif!");
        }
    }
    
    protected String formatRp(double nilai) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nf.format(nilai);
    }
    
    public  void tampilkanInfo() {
        System.out.println("Nama Produk: " + namaProduk +
                "\nHarga: " + formatRp(harga));
    }
}