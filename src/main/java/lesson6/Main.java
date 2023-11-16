package lesson6;

//В качестве домашнего задания студентам будет предложена задача реализовать Java приложение для демонстрации парадокса
//Монти Холла (Парадокс Монти Холла — Википедия) и наглядно убедиться в верности парадокса (запустить игру в цикле
//на 1000 и вывести итоговый счет).
//Студенту необходимо:
//Создать свой Java Maven/Gradle проект;
//Реализовать прикладную задачу - приложение для демонстрации парадокса Монти Холла;
//Можно добавить любые библиотеки которые считают необходимыми
//Результаты должны быть сохранены в HashMap (шаг цикла -> результат)
//Необходимо вывести статистику по результату - количество позитивных и негативных результатов, процент от общего
//количества шагов цикла.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int totalIterations = 1000;
        Map<Integer, Boolean> results = simulateMontyHall(totalIterations);

        int positiveCount = 0;
        int negativeCount = 0;

        for (boolean result : results.values()) {
            if (result) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println("Количество позитивных результатов: " + positiveCount);
        System.out.println("Количество негативных результатов: " + negativeCount);
        System.out.println("Процент позитивных результатов: " + ((double) positiveCount / totalIterations) * 100 + "%");
        System.out.println("Процент негативных результатов: " + ((double) negativeCount / totalIterations) * 100 + "%");
    }

    private static Map<Integer, Boolean> simulateMontyHall(int iterations) {
        Map<Integer, Boolean> results = new HashMap<>();
        Random random = new Random();

        for (int i = 1; i <= iterations; i++) {

            int prizeDoor = random.nextInt(3) + 1;
            int chosenDoor = random.nextInt(3) + 1;

            int montiDoor = findMontiDoor(prizeDoor, chosenDoor);

            int remainingDoor = findRemainingDoor(chosenDoor, montiDoor);

            boolean win = (remainingDoor == prizeDoor);
            results.put(i, win);
        }

        return results;
    }

    private static int findMontiDoor(int prizeDoor, int chosenDoor) {
        for (int i = 1; i <= 3; i++) {
            if (i != chosenDoor && i != prizeDoor) {
                return i;
            }
        }
        return -1;
    }

    private static int findRemainingDoor(int chosenDoor, int montiDoor) {
        for (int i = 1; i <= 3; i++) {
            if (i != chosenDoor && i != montiDoor) {
                return i;
            }
        }
        return -1;
    }
}
