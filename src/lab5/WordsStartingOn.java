package lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsStartingOn {
    public static void main(String[] args) {
        String text = "Can't change the one you are," +
                "Can't change the one you love," +
                "Lower your guard," +
                "I've made a few mistakes," +
                "I'll tell you what it takes\nUnder the stars." +
                "Have you seen the other me at times\nWalking on an ever looser line?" +
                "Baby, this is a wake," +
                "You and I will not escape" +
                "As time goes by." +
                "The world's never been older," +
                "Your head on my shoulder,"+
                "So close your eyes.";
        String letter = "a";
        String letter2 = letter.toUpperCase();//
        Pattern pattern = Pattern.compile("(?<=[\\s.,;:])" + letter + "\\w*(?=[.,;:])?");
        Matcher matcher = pattern.matcher(text);
        Pattern pattern2 = Pattern.compile("(?<=[^\\s.,;:])" + letter2 + "\\w*(?=[.,;:])?");
        Matcher matcher2 = pattern2.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}

//        (?<=pattern) положительное look-behind условие
//        (?<!pattern) отрицательное look-behind условие
//        (?=pattern) положительное look-ahead условие
//        (?!pattern) отрицательное look-ahead условие
//аналоги $ и ^
