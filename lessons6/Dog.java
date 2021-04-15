package lessons_6;

public class Dog extends Animal {
    public Dog() {
        super(500, 10);
    }

    @Override
    public void run(int distance) {
        System.out.printf("Lord run %s: %s%n", distance, distance <= getMaxRunDistance());
    }

    @Override
    public void swin(int distance) {
        System.out.printf("Lord swin %s: %s%n", distance, distance <= getMaxSwinDistance());
    }
}
