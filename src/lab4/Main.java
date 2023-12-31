package lab4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String str = "55369139";
        try {
            Integer num = toInteger.getNum(str);
            System.out.println(num);
        } catch (CustomNumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        str = "text";
        try {
            Integer num = toInteger.getNum(str);
            System.out.println(num);
        } catch (CustomNumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

