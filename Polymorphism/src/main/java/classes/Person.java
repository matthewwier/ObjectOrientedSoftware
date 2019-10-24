package classes;

import storage.IStorageObject;


public class Person implements IStorageObject, Comparable<Person> {

    private int id;
    private String name;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void PrintMe() {
        System.out.println(name + ", " + age);
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public IStorageObject Store() {
        return this;
    }

    @Override
    public void Update(Object object) {
        Person p = (Person) object;
        this.age = p.getAge();
        this.name = p.getName();
    }

    @Override
    public void Delete(Object object) {
        Person p = (Person) object;
        System.out.println("Deleted object: ");
        p.PrintMe();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id, o.id);
    }
}
