/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

/**
 *
 * @author hero
 */
public class Buku extends Koleksi {
    private int stok;
    private String rak;
    private int baris;

    public Buku(String kode, String judul, int stok, String rak, int baris) {
        super(kode, judul);
        this.stok = stok;
        this.rak = rak;
        this.baris = baris;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok() {
        stok--;
    }

    public void tambahStok() {
        stok++;
    }

    @Override
    public String getInfo() {
        return judul + " | Kode: " + kode +  " | Stok: " + stok + " | Rak: " + rak + " | Baris: " + baris;
    }
}