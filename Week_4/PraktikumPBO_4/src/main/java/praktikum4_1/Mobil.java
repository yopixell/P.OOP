/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4_1;

/**
 *
 * @author hero
 */
public class Mobil extends Kendaraan {
    private final int jumlahPintu;    //Atribut tambahan khusus untuk mobil
    
    //Contructor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
        super(nama, kecepatanMaks, jenisMesin); //Memanggil constructor dari subclass
        this.jumlahPintu = jumlahPintu;
    }
    
    //Method untuk menampilkan informasi mobil
    public void tampilkaninfoMobil() {
        //Dapat mengakses kecepatanMaks karena proctected
        System.out.println("Kecepatan Maksimum Mobil: " + kecepatanMaks + "km/h");
        System.out.println(jumlahPintu + "Jumlah Pintu: " + jumlahPintu);
    }
}
