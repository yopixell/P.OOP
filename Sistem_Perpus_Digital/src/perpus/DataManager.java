/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;
import java.io.*;
import java.util.List;
/**
 *
 * @author hero
 */
public class DataManager {

    public static <T> void simpan(String file, List<T> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(data);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data!");
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> baca(String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<T>) ois.readObject();
        } catch (Exception e) {
            return new java.util.ArrayList<>();
        }
    }
}