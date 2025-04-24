import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Document {
    private final int id;
    private final String name;
    private final List<Document> relatedDocs = new ArrayList<>();

    public Document(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public void addRelatedDocument(Document doc) {
        relatedDocs.add(doc);
    }
    public void edit() {
        // 1. Собираем все документы, которые нужно заблокировать
        List<Document> toLock = new ArrayList<>(relatedDocs);
        toLock.add(this);
        // 2. Сортируем по id
        toLock.sort(Comparator.comparingInt(Document ::getId));

        // 3. Захватываем блокировки
        synchronized (toLock) {
            System.out.println(Thread.currentThread().getName() + " редактирует " + name);
            for (Document doc : relatedDocs) {
                synchronized (doc) {
                    System.out.println(Thread.currentThread().getName() + " редактирует связанный документ " + doc.name);
                    // имитация редактирования
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Document> getRelatedDocs() {
        return relatedDocs;
    }
}
