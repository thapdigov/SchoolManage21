/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Behruz Tapdiqov
 */
public class FileUtil  {

    public static void writeObjectToFile(Serializable object, String name) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))) {
            oos.writeObject(object);
        } catch (IOException ex) {
            System.out.println("yazilma mumkun olmadi...");
        }
    }
//Object fayli oxumaq

    public static Object readObjectFromFile(String name) {
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } catch (IOException ex) {
            System.out.println("Obyekt tapilmadi....");
        } finally {
            return obj;
        }

    }

}
