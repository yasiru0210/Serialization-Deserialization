package main.java.com.example1;

import java.io.Serializable;


public class Person implements Serializable {

    private static final long serialVersionUID = 5844513309517562729L;

    private String name;
    private int id;
    private transient String password;

    public Person(String name, int id,String password) {
        this.name = name;
        this.id = id;
        this.password=password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
