public class Person {
    private String name;
    private int aga;

    public Person(String name, int aga) {
        this.name = name;
        this.aga = aga;
    }

    public String getName() {
        return name;
    }

    public int getAga() {
        return aga;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", aga=" + aga +
                '}';
    }
}
