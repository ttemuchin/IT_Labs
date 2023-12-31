package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberFinder {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDigits("2 " +
                "man walked through the door. they left $15.17 and $44.14")));
    }

    public static Float[] findDigits(String text) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);
        ArrayList<Float> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(Float.parseFloat(matcher.group()));
        }
        Float[] out = new Float[list.size()];
        out = list.toArray(out);
        return out;
    }
}
