package lessons_6;

public class Cat extends Animal {
    public Cat() {
        super(200, -1);
    }

    @Override
    public void run(int distance) {
        System.out.printf("Lex run %s: %s%n", distance, distance <= getMaxRunDistance());
    }

    @Override
    public void swin(int distance) {
        System.out.println("Lex cannot swin");
    }
}
