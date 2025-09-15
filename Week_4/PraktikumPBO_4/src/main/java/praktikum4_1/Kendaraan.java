/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4_1;

/**
 *
 * @author hero
 */
public class Kendaraan {
    //Atribut dengan akses dalam kelas ini
    private String nama;            //Hanya bisa diakses dalam class ini
    protected int kecepatanMaks;    //Bisa diakses di package yang sama dan subclass
    public String jenisMesin;       //Bisa diakses dari mana saja
    
    //Constructor
    public Kendaraan(String nama, int KecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    //Getter dan Setter untuk variabel private nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    //Method public untuk menampilkan informasi kendaraan
    public void tampilkaninfoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + "km/h");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
