package lessons_6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(140);
            animals[i].swin(30);

        }
}
    }
