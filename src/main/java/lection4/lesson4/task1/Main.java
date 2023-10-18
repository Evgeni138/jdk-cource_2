package lection4.lesson4.task1;

import java.util.*;

//Задание 1
//        В рамках выполнения задачи необходимо:
//        ● Создайте коллекцию мужских и женских имен с помощью интерфейса List
//        ● Отсортируйте коллекцию в алфавитном порядке
//        ● Отсортируйте коллекцию по количеству букв в слове
//        ● Разверните коллекцию


// Task 2
//Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
//        Получите уникальный список Set на основании List
//        Определите наименьший элемент (алфавитный порядок)
//        Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
//        Удалите все элементы содержащие букву ‘A’



public class Main {

    public static void main(String[] args) {
        List<Name> names = new ArrayList<>();
        names.add(new MaleName("William"));
        names.add(new MaleName("Bober"));
        names.add(new FemaleName("Alice"));
        names.add(new FemaleName("Alice"));
        names.add(new MaleName("William"));
        names.add(new FemaleName("Ira"));
        names.add(new FemaleName("AnnaMaria"));


        NameList nameList = new NameList(names);

        NameList sortedNames = nameList.sortABC();

        for (Name name : sortedNames.names) {
            System.out.println(name.getName());
        }
        System.out.println();

        NameList sortedNames2 = nameList.sortSize();
        for (Name name : sortedNames2.names) {
            System.out.println(name.getName());
        }

        NameSet setNames = new NameSet(sortedNames2.names);
        System.out.println(setNames);
        System.out.println();

        System.out.println(setNames.reversBiggestItem());
        System.out.println();

        setNames.withoutA();
        System.out.println();

//        Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
//        Найдите человека с самым маленьким номером телефона
//        Найдите номер телефона человека чье имя самое большое в алфавитном порядке
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("12324", "User1");
        phoneBook.put("46344", "User2");
        phoneBook.put("75647", "User3");
        phoneBook.put("34532", "User4");
        phoneBook.put("23455", "User5");
        phoneBook.put("64564", "User6");
        int maxNumber = 0;

        for (String s: phoneBook.keySet()) {
            if (Integer.parseInt(s) > maxNumber) maxNumber = Integer.parseInt(s);
        }
        System.out.println(maxNumber);

        List<Map.Entry<String, String>> value = new ArrayList<>(phoneBook.entrySet());
        value.sort(Map.Entry.comparingByKey());
        System.out.println(value);


    }

}
