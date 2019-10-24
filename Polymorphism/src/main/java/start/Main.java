package start;

import classes.Book;
import classes.Person;
import dao.IDao;
import dao.MySQLIDao;
import dao.SQLServerIDao;

public class Main {
    public static void main(String[] args) {

        Book b = new Book(0, "Harry Potter", "J.K. Rowling", "20");
        IDao sqlServerIDao = new SQLServerIDao();
        sqlServerIDao.save(b);
        sqlServerIDao.getObjectById(0).PrintMe();
        sqlServerIDao.update(new Book(0, "Harry Potter", "J.K. Rowling", "15"));
        sqlServerIDao.getObjectById(0).PrintMe();
        sqlServerIDao.delete(new Book(0, "Harry Potter", "J.K. Rowling", "15"));

        Person p = new Person(0, "Andrew", 20);
        IDao mySQLIDao = new MySQLIDao();
        mySQLIDao.save(p);
        mySQLIDao.getObjectById(0).PrintMe();
        mySQLIDao.update(new Person(0, "Andrew", 21));
        mySQLIDao.getObjectById(0).PrintMe();
        mySQLIDao.delete(new Person(0, "Andrew", 21));
    }
}
