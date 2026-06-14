import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    Map<String , Integer> wordCounter= new HashMap<String, Integer>();
    public int count(String word)
    {

        Integer countWord= wordCounter.get(word);
        if (countWord != null) {
            wordCounter.put(word, countWord + 1);
        } else {
            wordCounter.put(word, 1);
        }
        return wordCounter.get(word);
    }
}
