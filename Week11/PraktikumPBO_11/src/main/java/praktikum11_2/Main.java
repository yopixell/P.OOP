package praktikum11_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hero
 */
public class Main {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Budi");
        Anggota anggota2 = new Anggota("Ani");

        Klub klubBola = new Klub("Klub Sepak Bola");
        Klub klubRenang = new Klub("Klub Renang");

        klubBola.tambahAnggota(anggota1);
        klubBola.tambahAnggota(anggota2);
        
        klubRenang.tambahAnggota(anggota1);
        klubBola.infoKlub();
        klubRenang.infoKlub();
    }
}
