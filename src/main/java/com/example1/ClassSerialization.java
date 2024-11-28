package main.java.com.example1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassSerialization {
    public static void main(String[] args) {
        Person person = new Person("Yasiru", 1);
        try {
            FileOutputStream fileOutput = new FileOutputStream("person.ser");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

            objectOutput.writeObject(person);
            System.out.println("Serialization successful!!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}