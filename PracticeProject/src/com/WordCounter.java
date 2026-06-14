package com;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String, Integer> wordCounter = new HashMap<>();

    private void take(String word)
    {

    }

    public int count(String word) {

        Integer countWord = wordCounter.get(word);
        if (countWord != null) {
            wordCounter.put(word, countWord + 1);
        } else {
            wordCounter.put(word, 1);
        }
        return countWord;
    }
}
