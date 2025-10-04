/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author hero
 */
public class pegawai {
    private String namaPegawai;
    private double gaji;
    
    public pegawai(String namaPegawai, double gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    public String getNamaPegawai() {
        return namaPegawai;
    }
    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    protected String formatRp(double nilai) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nf.format(nilai);
    }

    public void tampilkanInfo() {
        System.out.println("Pegawai: " + namaPegawai + 
                "\nGaji: " + formatRp(gaji));
    }
}