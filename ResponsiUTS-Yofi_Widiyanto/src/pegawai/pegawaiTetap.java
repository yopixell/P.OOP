/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;
/**
 *
 * @author hero
 */
public class pegawaiTetap extends pegawai {
    private double tunjangan;
    
    public pegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai      : " + getNamaPegawai() +
                "\nGaji              : " + formatRp(getGaji()) +
                "\nTunjangan         : " + formatRp(tunjangan));
    }
}