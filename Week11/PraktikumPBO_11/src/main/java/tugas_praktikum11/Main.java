/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum11;

/**
 *
 * @author pisangg
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();
        
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("J.K. Rowling");

        Buku buku1 = new Buku("Hujan", pengarang1);
        Buku buku2 = new Buku("Bumi", pengarang1);
        Buku buku3 = new Buku("Harry Potter", pengarang2);
        
        perpus.tambahBuku(buku1);
        perpus.tambahBuku(buku2);
        perpus.tambahBuku(buku3);

        perpus.infoPerpustakaan();
    }
}
