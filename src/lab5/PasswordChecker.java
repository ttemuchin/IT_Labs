package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println(checkPassword("aaaa04AZaaaabbbb"));
        System.out.println(checkPassword("aaaaaaa04"));
        System.out.println(checkPassword("aaaa04AZ"));
    }

    public static String checkPassword(String a) {
        Pattern patternLength = Pattern.compile(".{8,16}");
        Pattern patternSym = Pattern.compile("[0-9]+[A-Z]+");

        char[] charArr = a.toCharArray();
        Arrays.sort(charArr);
        String b = String.valueOf(charArr);
        Matcher matcherLen = patternLength.matcher(a);
        Matcher matcherSym = patternSym.matcher(b);
        if (!matcherLen.find()) {
            return "Неверная длина пароля";
        }
        else if (matcherSym.find()) {
            return "Пароль корректный";
        }
        else return "Пароль должен содержать хотя бы по одной заглавной букве и цифре";
    }
}
