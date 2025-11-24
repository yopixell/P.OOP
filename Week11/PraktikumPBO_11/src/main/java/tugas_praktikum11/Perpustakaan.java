/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum11;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pisangg
 */
public class Perpustakaan {
    private List<Buku> daftarBuku; 

    public Perpustakaan() {
        this.daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
        System.out.println("✅Berhasil menambahkan: " + buku.getJudul());
    }

    public void hapusBuku(String judulBuku) {
        Buku bukuDihapus = null;
        for (Buku b : daftarBuku) {
            if (b.getJudul().equalsIgnoreCase(judulBuku)) {
                bukuDihapus = b;
                break;
            }
        }
        
        if (bukuDihapus != null) {
            daftarBuku.remove(bukuDihapus);
            System.out.println("Buku '" + judulBuku + "' telah dihapus dari sistem.");
        } else {
            System.out.println("Buku '" + judulBuku + "' tidak ditemukan.");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("KATALOG");
        if (daftarBuku.isEmpty()) {
            System.out.println("(Perpustakaan sedang kosong)");
        } else {
            for (Buku buku : daftarBuku) {
                buku.infoBuku();
                System.out.println("========================");
            }
        }
    }
}