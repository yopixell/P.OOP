/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author hero
 */
public class main {
    public static void main(String[] args) {
        kendaraan mobil = new mobil();
        kendaraan sepeda = new sepeda();
        //kendaraan mobil1 = new mobil();
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
    }
}
