package lection3.lesson3.task5;

public class Main {

    public static void main(String[] args) {

//        System.out.println(Calculator.sum(123, 5.0f));
//        System.out.println(Calculator.mult(10, 3.0));

        String[] array1 = {"a", "F", "1"};
        String[] array2 = {"a", "F", "1"};
        String[] array3 = {"a", "F", "3"};
        System.out.println(compareArray(array1, array2));
        System.out.println(compareArray(array3, array2));


    }

    public static <T> boolean compareArray(T[] array1, T[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) return false;
        }
        return true;
    }



}
