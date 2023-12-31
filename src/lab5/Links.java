package lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Links {
    public static void main(String[] args) {
        System.out.println(getLink("some words https://google.com more words https://goal.com words again https://yandex.ru/search"));
    }

    public static String getLink(String a) {
        Pattern pattern = Pattern.compile("(\\bhttps://[\\w-]{1,32}\\.[\\w-/]{1,32})\\s*");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()) {
            String link = matcher.group();
            a = a.replaceAll(link, "<a href=" + link + ">Link</a> ");
        }
        return a;
    }
}
