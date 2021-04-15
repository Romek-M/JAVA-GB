package lessons_6;

public abstract class Animal {
    private final int maxSwinDistance;
    private final int maxRunDistance;

    public Animal(int maxRunDistance, int maxSwinDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwinDistance = maxSwinDistance;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxSwinDistance() {
        return maxSwinDistance;
    }

    public abstract void run(int distance);
    public abstract void swin(int distance);
}
