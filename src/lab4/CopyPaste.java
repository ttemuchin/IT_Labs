package lab4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.WritePendingException;

public class CopyPaste {
    public static boolean copyFile(String from, String to) {
        StringBuilder str = new StringBuilder();
        try (FileReader reader = new FileReader(from);) {
            int chr;
            while((chr=reader.read())!=-1){
                str.append((char) chr);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return false;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }

        try (FileWriter writer = new FileWriter(to)) {
            writer.write(str.toString());
        } catch (WritePendingException e) {
            System.out.println("Ошибка записи");
            return false;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        if (copyFile("src/lab4/file1.txt", "src/lab4/file2.txt")) {
            System.out.println("Successful");
        }
        else System.out.println("Failed");
    }

}
