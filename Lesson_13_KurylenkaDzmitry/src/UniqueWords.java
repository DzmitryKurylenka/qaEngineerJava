/* 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово (реализовать с использованием коллекций)
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {
                "Tim", "Bob", "Mike", "Ted", "Jim",
                "Arnold", "Tim", "Bob", "Mike", "Ted",
                "Chuk", "Gek", "Tim", "Bob", "Dawid",
                "Pol", "Cuper", "Denny", "Billy", "Tim"
        };
        Set<String> uniqueWords = new HashSet<>(); // Set для хранения UniqueWords
        Map<String, Integer> wordCount = new HashMap<>(); // Map для подсчета количества
        for (String word : words) {
            uniqueWords.add(word);
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("Список уникальных слов: " + uniqueWords);
        System.out.println("Количество каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}