/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;
/**
 *
 * @author hero
 */
public class pegawaiKontrak extends pegawai {
    private int lamaKontrak;
    
    public pegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai      : " + getNamaPegawai() +
                "\nGaji              : " + formatRp(getGaji()) +
                "\nLama Kontrak      : " + lamaKontrak + " Bulan");
    }
}
