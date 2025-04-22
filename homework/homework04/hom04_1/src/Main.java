//Подумать, как можно синхронизировать операцию transfer в последнем примере с урока
public class Main {
    public static  Object lock = new Object();
    public static void main(String[] args) throws InterruptedException {
        Account accountA = new Account("DE1111","Jack", 1000);
        Account accountB = new Account("DE2222","John", 1000);

        Thread thread1 = new Thread(() -> transfer(accountA, accountB, 100), "T1");
        Thread thread2 = new Thread(() -> transfer(accountB, accountA, 500), "T2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(accountA);
        System.out.println(accountB);

    }

    public static void transfer(Account from, Account to, double amount) {
        //Блокируем один аккаунт в одном порядке, чтобы избежать взаимной блокировки
        Account first = from.getIban().compareTo(to.getIban()) < 0 ? from : to;
        Account second = from.getIban().compareTo(to.getIban()) < 0 ? to : from;

        synchronized (first) {
            System.out.println(Thread.currentThread().getName() + " locked: " + first);

            synchronized (second) {
                System.out.println(Thread.currentThread().getName() + " locked: " + second);

                from.withdraw(amount);
                to.deposit(amount);

                System.out.println(Thread.currentThread().getName() + " transferred " + amount);
            }
        }
    }

}
