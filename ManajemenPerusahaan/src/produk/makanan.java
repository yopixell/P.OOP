/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produk;
import java.time.LocalDate;
/**
 *
 * @author hero
 */
public class makanan extends produk {
    private LocalDate tanggalKadaluarsa;
    
    public makanan(String namaProduk, double harga, LocalDate tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    public LocalDate getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    public void setTanggalKadaluarsa(LocalDate tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Produk       : " + getNamaProduk() +
                "\nHarga             : " + formatRp(getHarga()) + 
                "\nTanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}