package main;

import singletonDAO.AccessDAO;

public class Main {
    public static void main(String[] args) {
        AccessDAO dao = AccessDAO.getInstance();
        dao.saveUser("Andrzej","Kowalski",1977, 22);
        //dao.saveBook("Władca pierścieni", "1");
        //dao.deleteUser("Andrzej", "Kowalski");
        //dao.updateBook("1", "Harry Potter", "1");
        //dao.updateUser("1", "Jan", "Nowak", 1969, 0);
        //dao.deleteBook("Władca", "1");
        dao.borrowBook("Potop", "1");
        //dao.returnBook("Potop", "1");
        dao.listBooks();
        AccessDAO dao2 = AccessDAO.getInstance();
        dao2.listUsers();
    }
}
