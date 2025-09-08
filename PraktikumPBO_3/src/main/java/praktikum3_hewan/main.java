/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3_hewan;

/**
 *
 * @author hero
 */
public class main {
    public static void main(String[] args) {
        hewan kucing = new hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        kucing.berlari();
        
        hewan anjing = new hewan("Truf", 2);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
}
