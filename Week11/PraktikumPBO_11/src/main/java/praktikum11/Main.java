/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author hero
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        
        Buku book1 = new Buku("Dark Psychology");
        Buku book2 = new Buku("Berserk");
        Buku book3 = new Buku("A Little Life");
        
        perpus.tambahBuku(book1);
        perpus.tambahBuku(book3);
        perpus.tambahBuku(book2);
        
        System.out.println("Daftar Buku di Perpustakaan:");
        perpus.infoPerpustakaan();
    }
}
