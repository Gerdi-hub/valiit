package DayTwo;

public class Strings {
    public static void main(String[] args) {
        String original = "Hello World!";
        String newString = original.toUpperCase();
        System.out.println(newString);

        String lowerCaseString = newString.toLowerCase();
        System.out.println(lowerCaseString);

        if (lowerCaseString.toLowerCase().contains("world")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String word = "Hello";
        System.out.println(word.charAt(0));

        System.out.println(original.replace("o", "a"));

        System.out.println(specific(original));

        System.out.println(original.substring(7, 12));
        System.out.println(original.indexOf("o"));
        System.out.println(original.lastIndexOf("l"));

        System.out.println(replaceWord(original, "Hello", "By"));

    }

    public static boolean specific(String word) {
        return word.startsWith("Hello") && word.endsWith("World!");

    }

    public static String replaceWord(String word, String word1, String word2) {
        return word.replace(word1, word2);
    }

}
