package lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpAddress {
    public static void main(String[] args) {
        String address1 = "2.48.196.255";
        String address2 = "13.48.196.256";
        String address3 = "a?.48.196.250";
        String address4 = "148.196.250.";
        String address5 = "1.2.3.4";
        System.out.println(validAddress(address1));
        System.out.println(validAddress(address2));
        System.out.println(validAddress(address3));
        System.out.println(validAddress(address4));
        System.out.println(validAddress(address5));
    }
    public static boolean validAddress(String a) {
        Pattern pattern = Pattern.compile("^((1?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}"+"(1?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher matcher = pattern.matcher(a);
        return matcher.matches();
    }
}
