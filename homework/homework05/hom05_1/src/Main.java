public class Main {
    public static void main(String[] args) throws InterruptedException {
        Document doc1 = new Document(1, "Doc1");
        Document doc2 = new Document(2, "Doc2");

        // Делаем документы связанными друг с другом
        doc1.addRelatedDocument(doc2);
        doc2.addRelatedDocument(doc1);

        // Поток A: редактирует doc1
        Thread threadA = new Thread(() -> {
            doc1.edit(); // захватывает doc1, потом doc2
        }, "Поток A");

        // Поток B: редактирует doc2
        Thread threadB = new Thread(() -> {
            doc2.edit(); // захватывает doc2, потом doc1
        }, "Поток B");

        // Запуск потоков
        threadA.start();
        threadB.start();

        // Ждём их завершения
        threadA.join();
        threadB.join();

        System.out.println("Редактирование завершено");
    }
}