import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = ArrayList<>(Arrays.asList("apple", "banana", "Cherry", "date", "fig"));
        Supplier<String> wordremover = () -> {
            String result = "";
            for (String word : words) {
                result += word + "\n";
            }

            words.removeIf(word -> word.contains("e"));
            return result;
        };

        System.out.println(wordremover.get());

        System.out.println(words);
    }

}