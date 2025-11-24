/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum11;

/**
 *
 * @author acer
 */
public class Buku {
    private String judul;
    
    public Buku(String judul) {
        this.judul = judul;
    }
    
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
    }
}