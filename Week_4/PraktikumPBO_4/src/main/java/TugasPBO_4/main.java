/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO_4;

/**
 *
 * @author hero
 */
public class main {
    public static void main(String[] args) {
        //Membuat objek pekerja
        pekerja pekerja1 = new pekerja("Hero", 21, "Satpam", 5000000);
        
        //Menampilkan informasi pekerja
        System.out.println("Informasi Awal");
        System.out.println(pekerja1.toString());
        System.out.println();
        
        //Mengubah nama menggunakan setter
        pekerja1.setNama("Hero Hyuga");
        
        //Menampilkan informasi pekerja setelah diubah
        System.out.println("Informasi Pekerja:");
        System.out.println(pekerja1.toString());
        
        //Akses langsung atribut nama, usia dan gaji pada objek pekerja
        //System.out.println(pekerja1.nama):    //Error: nama bersifat private dalam class manusia
        //System.out.println(pekerja1.usia);    //Bisa: karena protected dapat ditampilkan di package yang sama
        //System.out.println(pekerja1.gaji);    //Error: gaji bersifat private dalam subclass pekerja
    }
}
