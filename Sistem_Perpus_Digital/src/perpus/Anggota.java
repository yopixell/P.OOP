/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;
import java.io.Serializable;
/**
 *
 * @author hero
 */
public class Anggota implements Serializable {
    private String kode;
    private String nama;

    public Anggota(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }
    
    @Override
    public String toString() {
        return "Kode: " + kode + " | Nama: " + nama;
    }
}

