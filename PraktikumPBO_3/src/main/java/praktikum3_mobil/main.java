/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3_mobil;

/**
 *
 * @author hero
 */
public class main {
    public static void main(String[] args) {
        mobil mobil1 = new mobil("Supra", "MK 5", 2019, "Putih");
        mobil mobil2 = new mobil("Nissan", "GT-R R34", 1999, "Hitam");

        mobil1.info();
        mobil1.startEngine();

        mobil2.info();
        mobil2.startEngine();

    }
}
