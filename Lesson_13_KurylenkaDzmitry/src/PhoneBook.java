/* 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        В этот телефонный справочник с помощью метода add() можно добавлять записи,
        а с помощью метода get() искать номер телефона по фамилии. Следует учесть,
        что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
        тогда при запросе такой фамилии должны выводиться все телефоны.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;
    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }
    public void add(String lastName, String phoneNumber) {
        if (!phoneBook.containsKey(lastName)) {
            phoneBook.put(lastName, new ArrayList<>());
        }
        phoneBook.get(lastName).add(phoneNumber);
    }
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "555666");
        phoneBook.add("Петров", "777888");
        phoneBook.add("Сидоров", "999000");
        phoneBook.add("Иванов", "333111");
        phoneBook.add("Петров", "666444");
        phoneBook.add("Васильев", "555666");
        phoneBook.add("Васильев", "111222");
        phoneBook.add("Васильев", "222333");

        System.out.println("Телефоны с фамилией Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны с фамилией Петров: " + phoneBook.get("Петров"));
        System.out.println("Телефоны с фамилией Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны с фамилией Васильев: " + phoneBook.get("Васильев"));
        System.out.println("Телефоны с фамилией Попов: " + phoneBook.get("Попов"));
    }
}

