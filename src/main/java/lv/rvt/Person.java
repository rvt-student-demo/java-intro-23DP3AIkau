package lv.rvt;

public class Person {

    private String name;
    private int age;
    private String address;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "\n   " + address;
    }
}