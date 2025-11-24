/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum11;
/**
 *
 * @author pisangg
 */
public class Pengarang {
    private String nama;

    public Pengarang(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void infoPengarang() {
        System.out.println("Author: " + nama);
    }
}