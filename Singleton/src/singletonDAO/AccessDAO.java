package singletonDAO;

import operations.BooksOperations;
import operations.UsersOperations;

public class AccessDAO {

    private static AccessDAO accessDAO;

    public void saveUser(String firstname, String lastname, int year, int fine) {
        UsersOperations.writeUser(firstname, lastname, year, fine);
    }

    public void deleteUser(String firstname, String lastname) {
        UsersOperations.removeUser(firstname, lastname);
    }

    public void saveBook(String title, String userId) {
        BooksOperations.writeBook(title, userId);
    }

    public void deleteBook(String title, String userID) {
        BooksOperations.removeBook(title, userID);
    }

    public void updateUser(String id, String firstname, String lastname, int year, int fine) {
        UsersOperations.updateUser(id, firstname, lastname, year, fine);
    }

    public void updateBook(String id, String title, String userId) {
        BooksOperations.updateBook(id, title, userId);
    }

    public void listUsers() {
        UsersOperations.listUsers();
    }

    public void listBooks() {
        BooksOperations.listBooks();
    }

    public void returnBook(String title, String userID) {
        BooksOperations.removeBook(title, userID);
    }

    public void borrowBook(String title, String userID) {
        BooksOperations.writeBook(title, userID);
    }

    public static AccessDAO getInstance() {
        if (accessDAO == null) {
            accessDAO = new AccessDAO();
        }
        return accessDAO;
    }

}
