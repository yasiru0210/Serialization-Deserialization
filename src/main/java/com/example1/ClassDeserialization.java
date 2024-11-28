package main.java.com.example1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassDeserialization {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("person.ser");
            ObjectInputStream in= new ObjectInputStream(inputStream);

            Person person = (Person) in.readObject();
            System.out.println("Deserialization object :"+person);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
