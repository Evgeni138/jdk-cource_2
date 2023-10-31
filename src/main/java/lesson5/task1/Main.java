package lesson5.task1;

// Создать два класс ObjectA, ObjectB
//Реализовать класс в котором два потока вызовут DeadLock
public class Main {
    public static void main(String[] args) {
        ObjectA objectA = new ObjectA();
        ObjectB objectB = new ObjectB();

//        Runnable run1 = () -> {
//            int value = objectA.getValue();
//            objectB.setValue(value);
//            System.out.println("value = " + value);
//        };
//
//        Runnable run2 = new Runnable() {
//            @Override
//            public void run() {
//                int value = objectB.getValue();
//                objectA.setValue(value);
//                System.out.println("value = " + value);            }
//        };
//
//        Thread thread1 = new Thread(run1);
//        Thread thread2 = new Thread(run2);
//
//        thread1.start();
//        thread2.start();

        try {
            method1(objectA, objectB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized void method1(ObjectA objectA, ObjectB objectB) {
        synchronized (objectA) {
            synchronized (objectB) {
                if (objectA.getValue() == objectB.getValue()) {
                    System.out.println(" Result ");
                } else {
                    objectA.setValue(objectB.getValue());
                    System.out.println(objectA.getValue());
                }
            }
        }
    }
}
