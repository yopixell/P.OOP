/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum10;

/**
 *
 * @author hero
 */
public class Main {
    public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        System.out.println("Elektronik: " +
                elektronik.hitungPajak(100000));
        
        Pembayaran makanan = new Makanan();
        System.out.println("Makanan: " +
                makanan.hitungPajak(15000));
    }
}
