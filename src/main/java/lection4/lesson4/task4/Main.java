package lection4.lesson4.task4;

import java.time.LocalDateTime;
import java.time.Month;

// Task 4
//        Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен
//        иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник сотрудников
public class Main {
    public static void main(String[] args) {

        NoteEmployee note = new NoteEmployee();
        Emloyee emloyee1 = new Emloyee("1234", "Employee1",
                LocalDateTime.of(2010, Month.APRIL, 20, 5, 5));
        Emloyee emloyee2 = new Emloyee("2334", "Employee2",
                LocalDateTime.of(2011, Month.APRIL, 20, 5, 5));
        Emloyee emloyee3 = new Emloyee("1534", "Employee3",
                LocalDateTime.of(2012, Month.JANUARY, 20, 5, 5));
        Emloyee emloyee4 = new Emloyee("4434", "Employee4",
                LocalDateTime.of(2013, Month.APRIL, 20, 5, 5));
        Emloyee emloyee5 = new Emloyee("5534", "Employee5",
                LocalDateTime.of(2014, Month.MARCH, 20, 5, 5));

        note.add(emloyee1);
        note.add(emloyee2);
        note.add(emloyee3);
        note.add(emloyee4);
        note.add(emloyee5);

        System.out.println(note.size());

        System.out.println("Employees by working years: " + note.getEmployee(10));
        System.out.println("Phones: " + note.getPhone("Employee5"));
        System.out.println(note.getEmployeeById(1));
        System.out.println(note.getPhone("Employee5"));

    }
}
