/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpus;
import java.util.Scanner;
/**
 *
 * @author hero
 */
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Perpustakaan p = new Perpustakaan();

        while (true) {
            System.out.println("\nMENU PERPUSTAKAAN");
            System.out.println("1. Input Buku");
            System.out.println("2. Input Anggota");
            System.out.println("3. Peminjaman");
            System.out.println("4. Pengembalian");
            System.out.println("5. Perpanjangan");
            System.out.println("6. Lihat Transaksi");
            System.out.println("7. Lihat Buku");
            System.out.println("8. Lihat Anggota");
            System.out.println("9. Hapus Anggota");
            System.out.println("0. Keluar");
            System.out.println("Pilih: ");
            
            try {
                int pilih = Integer.parseInt(sc.nextLine());

                switch (pilih) {
                    case 1 -> {
                        System.out.print("Kode: ");
                        String k = sc.nextLine();
                        System.out.print("Judul: ");
                        String j = sc.nextLine();
                        System.out.print("Stok: ");
                        int s = Integer.parseInt(sc.nextLine());
                        System.out.print("Rak: ");
                        String r = sc.nextLine();
                        System.out.print("Baris: ");
                        int b = Integer.parseInt(sc.nextLine());
                        p.bukuList.add(new Buku(k, j, s, r, b));
                    }
                    case 2 -> {
                        System.out.print("Kode Anggota: ");
                        String k = sc.nextLine();
                        System.out.print("Nama Anggota: ");
                        String n = sc.nextLine();
                        p.anggotaList.add(new Anggota(k, n));
                        System.out.println("Anggota berhasil ditambahkan.");
                    }
                    case 6 -> p.transaksiList.forEach(System.out::println);
                    case 7 -> p.bukuList.forEach(b -> System.out.println(b.getInfo()));
                    case 8 -> {
                        if (p.anggotaList.isEmpty()) {
                            System.out.println("Belum ada anggota terdaftar.");
                        } else {
                            System.out.println("DAFTAR ANGGOTA:");
                            p.anggotaList.forEach(System.out::println);
                        }
                    }    
                    
                    case 9 -> {
                        System.out.print("Masukkan Kode Anggota : ");
                        String kode = sc.nextLine();

                        Anggota target = null;
                        for (Anggota a : p.anggotaList) {
                            if (a.getKode().equalsIgnoreCase(kode)) {
                                target = a;
                                break;
                            }
                        }
                        if (target == null) {
                            System.out.println("Anggota tidak ditemukan.");
                            break;
                        }
                        boolean masihPinjam = p.transaksiList.stream()
                            .anyMatch(t -> t.getAnggota().getKode().equalsIgnoreCase(kode)
                                && !t.isDikembalikan());

                        if (masihPinjam) {
                            System.out.println("Anggota masih memiliki peminjaman aktif. Tidak bisa dihapus.");
                            break;
                        }

                        p.anggotaList.remove(target);
                        System.out.println("Anggota berhasil dihapus.");
                    }

                    case 0 -> {
                        p.simpanSemua();
                        return;
                    }
                }
                p.simpanSemua();
            } catch (Exception e) {
                System.out.println("Input tidak valid!");
            }
        }
    }
}