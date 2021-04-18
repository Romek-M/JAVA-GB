package lessons_7;

public class Plate {
    private final int capasity = 15;
    private int size = capasity;

    public boolean decrease(int request) {
        if (request <= size) {
            size -= request;
            return true;
        }
     return false;
    }
    public void add() {
        size = capasity;
    }

    public void add(int income) {
        int tnpSize = income + size;
size = Math.min(tnpSize, capasity);
    }



    @Override
    public String toString() {
        return "Plate{" +
                "capasity=" + capasity +
                ", size=" + size +
                '}';
    }
}
