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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return name + "\n   " + age + "\n   " + address;
    }
}