/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author hero
 */
public class Peminjaman implements IPeminjaman, Serializable {
    private Anggota anggota;
    private List<Buku> bukuList = new ArrayList<>();
    private LocalDate tanggalPinjam;
    private LocalDate jatuhTempo;
    private boolean diperpanjang = false;
    private boolean dikembalikan = false;

    public Peminjaman(Anggota anggota, Buku buku) {
        this.anggota = anggota;
        this.bukuList.add(buku);
        this.tanggalPinjam = LocalDate.now();
        this.jatuhTempo = tanggalPinjam.plusDays(7);
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public List<Buku> getBukuList() {
        return bukuList;
    }

    public LocalDate getJatuhTempo() {
        return jatuhTempo;
    }

    public boolean isDikembalikan() {
        return dikembalikan;
    }

    @Override
    public void perpanjang() {
        if (diperpanjang)
            throw new IllegalStateException("Buku sudah pernah diperpanjang!");
        jatuhTempo = jatuhTempo.plusDays(7);
        diperpanjang = true;
    }

    @Override
    public void kembalikan() {
        dikembalikan = true;
        for (Buku b : bukuList) {
            b.tambahStok();
        }
    }

    @Override
    public long hitungDenda() {
        if (dikembalikan) return 0;
        long telat = ChronoUnit.DAYS.between(jatuhTempo, LocalDate.now());
        return telat > 0 ? telat * 1000 : 0;
    }

    @Override
    public String toString() {
        return anggota.getNama() + " | Buku: " + bukuList.get(0).getJudul()
                + " | Jatuh Tempo: " + jatuhTempo
                + " | Denda: Rp" + hitungDenda();
    }
}