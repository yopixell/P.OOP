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
public abstract class Koleksi implements Serializable {
    protected String kode;
    protected String judul;

    public Koleksi(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
    }

    public abstract String getInfo();

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }
}