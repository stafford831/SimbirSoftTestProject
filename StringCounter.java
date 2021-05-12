import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCounter {
    public Map stringCount (String string) {
        Map<String, Integer> wordCounts = new HashMap<>();
        Arrays.stream(string.split("[^a-zA-Zа-яёА-ЯЁ]")).filter(w -> w.length() > 0)
                .forEach(w -> wordCounts.put(w, wordCounts.getOrDefault(w, 0) + 1));
        return wordCounts;
    }
}
