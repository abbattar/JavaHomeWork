package Home_Work_5;

import java.util.HashMap;
import java.util.List;

public class JHW5_1{
    // Обойдёмся без библиотеки Map
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(addInPhoneBook().get("Петров"));
        findInPhoneBook("Иванов");
        System.out.println();
        findInPhoneBook("Марочкин");
    }

    static HashMap<String, List<String>> addInPhoneBook() {
        extracted().put("Иванов", List.of("+7(111)111-11-11", "+7(222)222-22-22", "+7(985)981-82-83"));
        extracted().put("Петров", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        extracted().put("Сидоров",List.of("+7(555)555-55-55", "+7(666)666-66-66"));
        return extracted();
    }

    static void findInPhoneBook(String surname) {
        if (phoneBook.get(surname) != null) {
            System.out.printf("%s: %s", surname, phoneBook.get(surname));
        } else {
            System.out.println("Нет такой записи в телефонной книжке");
            return;
        }
    }

    private static HashMap<String, List<String>> extracted() {
        return phoneBook;
    }
}