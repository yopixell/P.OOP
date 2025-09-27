/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas2;

/**
 *
 * @author hero
 */
public class main {
    public static void main(String[] args) {
        mobil mobil1 = new mobil("Toyota", 2019, "Supra Mk5", "Bensin", 2, 250);
        sepedaMotor sepedaMotor1 = new sepedaMotor("Honda", 2013, "Supra X 125", "Bensin", 80);
        
        System.out.println("Info Mobil:");
        mobil1.info();
        
        System.out.println("\nInfo Sepeda Motor:");
        sepedaMotor1.info();
    }
}
