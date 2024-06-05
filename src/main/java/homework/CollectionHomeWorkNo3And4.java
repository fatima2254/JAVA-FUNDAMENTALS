package homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionHomeWorkNo3And4 {

    public static void main(String[] args) {
        String text = "You don’t get on by being original. You don’t get on by being bright. You don’t get on by being strong. You get on by being a subtle crook; somehow he thinks that’s what Norris is, and he feels an irrational dislike taking root, and he tries to dismiss it, because he prefers his dislikes rational, but after all, these circumstances are extreme, the cardinal in the mud, the humiliating tussle to get him back in the saddle, the talking, talking on the barge, and worse, the talking, talking on his knees, as if Wolsey’s unravelling, in a great unweaving of scarlet thread that might lead you back into a scarlet labyrinth, with a dying monster at its heart.";
        printUniqueWords(text);
        String text2 = "Number,Number, madam, flag, car, smartphone, watch, baseball, horse, radar, Alan, wall, eye, window, jacket, dog, hat, female, level, stone, ticket, water, keyboard, hand, car, hat, wall, stone, hair, rotator, time, table, car, dog, Hannah";
        printUniqueWords2(text2);
    }

    public static void printUniqueWords(String uniqueText) {
        String[] words = uniqueText.split("\\s+");
        Map<String,String> uniqueWords = new HashMap<>();
        for (String word : words) {
            uniqueWords.put(word,word);
        }
        System.out.println("Number of unique words: " + uniqueWords.size());

    }

    public static void printUniqueWords2(String uniqueText) {
        String[] words = uniqueText.split(",");
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.trim());
        }
        System.out.println("Number of unique words: " + uniqueWords);
        System.out.println("Number of unique words: " + uniqueWords.size());
    }
}
