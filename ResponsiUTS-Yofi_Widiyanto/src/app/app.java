/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import produk.*;
import pegawai.*;
import java.time.LocalDate;
/**
 *
 * @author hero
 */
public class app {
    public static void main(String[] args) {
        produk elektronik1 = new elektronik("Smartpone", 7000000, 2);
        elektronik1.tampilkanInfo();
        
        pegawai tetap1 = new pegawaiTetap("Yofi", 4500000, 1000000);
        tetap1.tampilkanInfo();
        
        produk makanan1 = new makanan("Roti", 5000, LocalDate.of(2023, 12, 30));
        pegawai kontrak1 = new pegawaiKontrak("Fitya", 3500000, 24);

        makanan1.tampilkanInfo();
        kontrak1.tampilkanInfo();
    }
}