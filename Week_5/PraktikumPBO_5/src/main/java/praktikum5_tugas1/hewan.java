/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas1;

/**
 *
 * @author hero
 */
public class hewan {
    protected String nama;
    protected String jenis;
    
    public hewan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama : " + nama
        + "\nJenis: " + jenis);
    }
}
