package operations;

import java.io.*;

public class UsersOperations {

    public static void writeUser(String firstname, String lastname, int year, int fine) {
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;
        try {
            bufferedReader = new BufferedReader(new FileReader("database.csv"));
            bufferedWriter = new BufferedWriter(new FileWriter("temporary"));
            String line;
            String previousLine = "0;";
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("Books")) {

                    int index = Integer.parseInt(previousLine.split(";")[0]);
                    index++;
                    bufferedWriter.write(index + ";" + firstname + ";" + lastname + ";" + year + ";" + fine + "\n");
                }
                bufferedWriter.write(line + "\n");
                previousLine = line;
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

    public static void removeUser(String firstname, String lastname) {
        BufferedReader bufferedReader;
        BufferedWriter bufferedWriter;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter("temporary"));
            bufferedReader = new BufferedReader(new FileReader("database.csv"));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("line:" + line);
                if (!(line.contains(firstname) && line.contains(lastname))) {
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

    public static void listUsers() {
        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader("database.csv"));

            String line;
            String[] data;
            System.out.println("Users:");
            while ((line = bufferedReader.readLine()) != null) {
                if ((line.split(";").length) == 5) {
                    data = line.split(";");
                    System.out.println("id:" + data[0] + ", firstname:" + data[1] + ", lastname:"
                            + data[2] + ", year:" + data[3] + ", fine:" + data[4]);
                }
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateUser(String id, String firstname, String lastname, int year, int fine) {
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
                if ((line.split(";")[0].contains(id)) && !book) {
                    bufferedWriter.write(id + ";" + firstname + ";" + lastname + ";" + year + ";" + fine + "\n");
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