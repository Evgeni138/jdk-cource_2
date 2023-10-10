package lesson2;

/**
 * Давайте создадим класс для управления банковским счетом. В этом классе будет приватное свойство для хранения
 * текущего баланса, а также методы для внесения и снятия денег со счета.
 * Класс должен содержать приватное свойство #balance, которое инициализируется значением 0 и представляет собой
 * текущий баланс счета.
 * Реализуйте геттер balance, который позволит получить информацию о текущем балансе.
 * Реализуйте метод deposit(amount), который позволит вносить средства на счет. Убедитесь, что сумма внесения не
 * отрицательная; в противном случае выбрасывайте ошибку.
 * Реализуйте метод withdraw(amount), который позволит снимать средства со счета. Убедитесь, что сумма для снятия
 * неотрицательная и что на счете достаточно средств; в противном случае выбрасывайте ошибку.
 * Реализуйте конструктор, который принимает начальный баланс в качестве аргумента. Убедитесь, что начальный баланс
 * не отрицательный; в противном случае выбрасывайте ошибку.
 */
class BankAccount extends Account{
// Приватное свойство для хранения баланса

// Геттер для получения текущего баланса

// Метод для внесения денег на счет

// withdraw(amount) Метод для снятия денег со счета

// constructor(initialBalance) Конструктор для инициализации начального баланса

    // Создаем новый банковский счет с начальным балансом 500
//    let account = new BankAccount(500);
//console.log(account.balance); // Выводит: 500
//
//        account.deposit(200);
//        console.log(account.balance); // Выводит: 700
//
//        account.withdraw(100);
//        console.log(account.balance); // Выводит: 600


    private int balance;

    public BankAccount() {

    }

    public int getBalance() {
        return balance;
    }

    public BankAccount(int balance) {
        try {
            if (balance < 0) {
                throw new RuntimeException("Сумма меньше нуля");
            } else {
                this.balance = balance;
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка при открытии счета: " + e);
            System.exit(1);
        }
    }

    public void deposit(int amount) {
        try {
            if (amount < 0) {
                throw new RuntimeException("Сумма меньше нуля");
            } else {
                balance += amount;
                System.out.printf("Вы положили %d, на балансе сейчас: %d\n", amount, balance);
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e);
        }
    }

    public void withdraw(int amount) {
        try {
            if (amount < 0) {
                throw new RuntimeException("Сумма меньше нуля");
            } else if (amount > balance) {
                throw new RuntimeException("Запрашиваемая сумма больше баланса");
            } else {
                balance -= amount;
                System.out.printf("Вы сняли: %d, на счете осталось: %d\n", amount, balance);
            }
        } catch (RuntimeException e){
            System.out.println("Ошибка: " + e);
        }
    }
}


