package lab4;

import java.io.FileWriter;
import java.io.IOException;

public class toInteger {
    public static int getNum(String str) throws CustomNumberFormatException {
        try {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException ex) {
            try (FileWriter writer = new FileWriter("src/lab4/file1.txt", false);) {
                writer.write("Exception "+ex.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            throw new CustomNumberFormatException("Something wrong.. "+ex.getLocalizedMessage());
        }
    }
}

class CustomNumberFormatException extends Exception {
    public CustomNumberFormatException(String text) {
        super(text);
    }
}
