package com.yash.oops;
import java.io.*;

class SerializableClass implements Serializable {
    String name;

    public SerializableClass(String name) {
        this.name = name;
    }
}

public class Deserialization {
    public static void main(String[] args) {
        try {
            // Creating FileOutputStream class object
            FileOutputStream f = new FileOutputStream("file.txt");

            // Creating ObjectOutputStream class object
            ObjectOutputStream oos = new ObjectOutputStream(f);

            // Creating SerializableClass object
            SerializableClass sc = new SerializableClass("Dhanashri Salunkhe");

            // Writing object to file
            oos.writeObject(sc);

            // Closing streams
            f.close();
            oos.close();

            // Deserializing object
            FileInputStream fi = new FileInputStream("file.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);

            SerializableClass d = (SerializableClass) oi.readObject();

            System.out.println(d.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}