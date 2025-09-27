/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas2;

/**
 *
 * @author hero
 */
public class kendaraanDarat extends kendaraan {
    String bahanBakar;
    
    public kendaraanDarat(String merek, int tahunProduksi, String jenis, String bahanBakar) {
        super(merek, tahunProduksi, jenis);
        this.bahanBakar = bahanBakar;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Jenis Mesin         : " + bahanBakar);
    }
}
