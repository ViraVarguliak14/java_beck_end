public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
//класс Account не потокобезопасен, потому что deposit() и withdraw()
// меняют общий ресурс — balance, и если вызывать их одновременно из разных потоков, получится гонка данных