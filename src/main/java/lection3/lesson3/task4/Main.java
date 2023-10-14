package lection3.lesson3.task4;

public class Main {

    public static void main(String[] args) {
        Person person1 = new HardWorker();
        Person person2 = new HardWorker();
        Person person3 = new HardWorker();
        Person person4 = new HardWorker();
        Person person5 = new HardWorker();
        Person person6 = new Idle();
        Person person7 = new Idle();
        Person person8 = new Idle();
        Person person9 = new Idle();
        Person person10 = new Idle();

        Person[] people = {person1, person2, person3, person4, person5, person6, person7, person8, person9, person10};

        WorkPlace<? extends Person> factory = new WorkPlace<>(people);
        Club<? extends Person> club = new Club<>(people);

        factory.workForAll();
        club.restForAll();

        for (Person person: people) {
            System.out.println(person);
        }
    }
}
