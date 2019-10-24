package operations;

import java.io.*;

public class BooksOperations {
    public synchronized static void writeBook(String title, String userId) {
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter("temporary"));
            bufferedReader = new BufferedReader(new FileReader("database.csv"));

            String line;
            boolean books = false;
            int index;
            String previousLine = "1;";
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
                previousLine = line;
            }
            if(previousLine.contains("Books")){
                bufferedWriter.write("1" + ";" + title + ";" + userId + "\n");
            }else{
                index = Integer.parseInt(previousLine.split(";")[0]);
                index++;
                bufferedWriter.write(index + ";" + title + ";" + userId + "\n");
            }
            bufferedReader.close();
            bufferedWriter.close();

            File temporaryFile = new File("temporary");
            File databaseFile = new File("database.csv");

            File file = new File("database.csv");

            file.delete();
            temporaryFile.renameTo(databaseFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeBook(String title, String userID) {
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        System.out.println(title);
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("temporary"));
            bufferedReader = new BufferedReader(new FileReader("database.csv"));
            boolean books = false;
            String line;
            while ((line = bufferedReader.readLine()) != null) {

                if (!books) {
                    bufferedWriter.write(line + "\n");
                    System.out.println("jeszcze nie w książkach");
                } else {
                    String[] lineData = line.split(";");
                    if (((lineData[1].equals(title)) && (lineData[2].equals(userID)))) {
                    }else {
                        bufferedWriter.write(line + "\n");
                    }
                }
                if (line.contains("Books:")) {
                    books = true;
                }
            }
            bufferedReader.close();
            bufferedWriter.close();

            File temporaryFile = new File("temporary");
            File databaseFile = new File("database.csv");

            File file = new File("database.csv");

            file.delete();
            temporaryFile.renameTo(databaseFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listBooks() {
        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader("database.csv"));

            String line;
            String[] data;
            System.out.println("Books:");
            while ((line = bufferedReader.readLine()) != null) {
                if ((line.split(";").length) == 3) {
                    data = line.split(";");
                    String[] userData = BooksOperations.getUserData(data[2]);
                    if (userData != null) {
                        System.out.println("id:" + data[0] + ", title:" + data[1] + ", loaned by:"
                                + userData[1] + " " + userData[2]);
                    }
                }
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String[] getUserData(String id) {
        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader("database.csv"));

            String line;
            String[] data;
            while ((line = bufferedReader.readLine()) != null) {
                if ((line.split(";").length) == 5) {
                    data = line.split(";");
                    if (data[0].equals(id)) {
                        bufferedReader.close();
                        return data;
                    }
                }
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public synchronized static void updateBook(String id, String title, String userId) {
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter("temporary"));
            bufferedReader = new BufferedReader(new FileReader("database.csv"));

            String line;
            boolean book = false;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("Books:")) {
                    book = true;
                }
                if ((line.split(";")[0].contains(id)) && book) {
                    bufferedWriter.write(id + ";" + title + ";" + userId + "\n");
                } else {
                    bufferedWriter.write(line + "\n");
                }
            }
            bufferedReader.close();
            bufferedWriter.close();

            File temporaryFile = new File("temporary");
            File databaseFile = new File("database.csv");

            File file = new File("database.csv");

            file.delete();
            temporaryFile.renameTo(databaseFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
