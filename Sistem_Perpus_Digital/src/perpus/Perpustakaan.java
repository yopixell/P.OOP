/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;
import java.util.*;
/**
 *
 * @author hero
 */
public class Perpustakaan {
    List<Buku> bukuList;
    List<Anggota> anggotaList;
    List<Peminjaman> transaksiList;

    public Perpustakaan() {
        bukuList = DataManager.baca("buku.ser");
        anggotaList = DataManager.baca("anggota.ser");
        transaksiList = DataManager.baca("transaksi.ser");
    }

    public void simpanSemua() {
        DataManager.simpan("buku.ser", bukuList);
        DataManager.simpan("anggota.ser", anggotaList);
        DataManager.simpan("transaksi.ser", transaksiList);
    }
}