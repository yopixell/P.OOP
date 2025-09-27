/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5_tugas1;

/**
 *
 * @author hero
 */
public class main {
    public static void main(String[] args) {
        kucing kucing1 = new kucing("Tom", "Domestic Shorthair");
        anjing anjing1 = new anjing("Spike", "Bulldog");
        
        System.out.println("Informasi Kucing : ");
        kucing1.tampilkanInfo();
        
        System.out.println("Informasi Anjing : ");
        anjing1.tampilkanInfo();
    }
}
