/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas2;

/**
 *
 * @author hero
 */
public class sepedaMotor extends kendaraanDarat {
    int kecepatan;
    
    public sepedaMotor(String merek, int tahunProduksi, String jenis, String bahanBakar, int kecepatan) {
        super(merek, tahunProduksi, jenis, bahanBakar);
        this.kecepatan = kecepatan;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Kecepatan Maksimal  : " + kecepatan + "km/h");
    }
}
