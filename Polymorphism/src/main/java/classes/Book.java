package classes;

import storage.IStorageObject;


public class Book implements IStorageObject, Comparable<Book> {

    private int id;
    private String name;
    private String author;
    private String price;

    public Book(int id, String name, String author, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void PrintMe() {
        System.out.println(name + ", " + author + ", " + price);
    }

    @Override
    public Book Store() {
        return this;
    }

    @Override
    public void Update(Object object) {
        Book b = (Book) object;
        this.author = b.getAuthor();
        this.price = b.getPrice();
        this.name = b.getName();
    }

    @Override
    public void Delete(Object object) {
        Book b = (Book) object;
        System.out.println("Deleted object: ");
        b.PrintMe();
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.id, o.id);
    }
}
