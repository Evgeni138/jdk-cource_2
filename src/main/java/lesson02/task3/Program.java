package lesson02.task3;
// Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender,
// и далее вызывался метод developGUI(), не изменяя существующие интерфейсы, только код основного класса.
//Developer dev = new FrontendDeveloper();
//        4 if (dev instanceof Frontender) {
//        5 ((Frontender) dev).developGUI();

import java.util.Arrays;
import java.util.List;

public class Program {
    public static int id;

    public static void main(String[] args) {
        Developer fullStackDeveloper = new DeveloperFullStack();
        Developer backEnder = new BackEnderDev();
        Developer frontEnder = new FrontEnderDev();
        Developer frontEnder2 = new FrontEnderDev();


        List<Developer> list = Arrays.asList(fullStackDeveloper, backEnder, frontEnder, frontEnder2);

        for (Developer item: list) {
            if (item instanceof FrontEnder) {
                ((FrontEnder) item).createFront();
                System.out.println();
            } else if (item instanceof BackEnder) {
                ((BackEnder) item).createServer();
                System.out.println();
            } else {
                ((DeveloperFullStack)fullStackDeveloper).createServer();
                ((DeveloperFullStack)fullStackDeveloper).createFront();
                System.out.println();
            }
        }

    }
}

abstract class Developer{
    public static int count = 0;
    int id;
    {
        id = ++count;
    }
}

interface BackEnder{
    void createServer();
}

interface FrontEnder{
    void createFront();
}

class FrontEnderDev extends Developer implements FrontEnder {

    @Override
    public void createFront() {
        System.out.printf("Front created by developer: #%d\n", id);
    }
}

class BackEnderDev extends Developer implements BackEnder {

    @Override
    public void createServer() {
        System.out.printf("Broke server by developer: #%d\n", id);
    }
}

interface FullStack extends BackEnder, FrontEnder {

}

class DeveloperFullStack extends Developer implements FullStack {

    @Override
    public void createServer() {
        System.out.printf("Server created by developer: #%d\n", id);
    }

    @Override
    public void createFront() {
        System.out.printf("Front created by developer: #%d\n", id);
    }
}